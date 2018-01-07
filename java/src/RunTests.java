import createFilePL0.CreateFile;

import java.io.*;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class RunTests {
    private static String ext = ".sll";
    private static String absolutePath = "";
    private static String testFolderPath = "";
    private static int testCount = 0;
    private static int succesCount = 0;
    private static int failCount = 0;
    private static String errorExt = "-errors.log";
    private static String pl0Ext = ".pl";
    private static String testOutput = "tests/testOutput";
    private static String testFiles = "tests/testFiles";
    private static String validFiles = "tests/testValidation";
    private static String resultFile = "tests/testsResult.txt";
    private static File validTests;
    private static String errors = "";


    public static void main(String[] args) throws Exception{
        validTests = new File(validFiles);

        cleanTestDirectory(new File(testOutput));
        new File(testOutput).mkdir();

        File tests = new File(testFiles);
        absolutePath = tests.getAbsolutePath();

        File output = new File(testOutput);
        testFolderPath = output.getAbsolutePath();
        innerCalls(tests);

        addInfo("Number of tests: " + testCount + ", successful tests:" + succesCount + ", failed tests: " + failCount);
        addInfo("Folder with tests: " + testFolderPath);

        writeError();
    }

    private static void innerCalls(File file) throws Exception{
        File [] files = file.listFiles();
        int size = files.length;

        for (int i = 0; i < size; i++) {
            File testFile = files[i];
            if (testFile.exists() && testFile.isDirectory()) {
                String destination = testFolderPath;
                destination += testFile.getAbsolutePath().substring(absolutePath.length());
                boolean success = (new File(destination).mkdir());
                if (success) {
                    innerCalls(testFile);
                }else {
                    addError("Test couldnt create directory: " + destination);
                }

            }else {
                if (testFile.exists() && testFile.isFile()) {
                    String extension = CreateFile.getExtension(testFile);

                    if (ext.equals(extension)) {
                        String destination = testFolderPath;
                        destination += testFile.getAbsolutePath().substring(absolutePath.length());

                        String [] paths = {testFile.getAbsolutePath(), destination};
                        addInfo("Testing parsing with file: " + testFile.getAbsolutePath() + " desstination " + destination);
                        //catching all exception possible in test -- > we dont need to destroy all tests because of one mistake
                        try {
                            Main.main(paths);

                        }catch (Exception e) {
                            Main.clean();
                            StringWriter sw = new StringWriter();
                            PrintWriter pw = new PrintWriter(sw);
                            e.printStackTrace(pw);
                            addError(sw.toString());
                        }

                        validateTest(CreateFile.getFilenameWithoutExtension(testFile.getAbsolutePath()), new File(destination));
                    }
                }
            }
        }
    }

    /**
     * validuje novy vytvoreny pl soubor se spravnym souborem ve slozce testValidation
     * @param filename
     * @param file
     */
    private static void validateTest(String filename, File file){
        testCount ++;
        File parent = new File (file.getParent());
        File [] files = parent.listFiles();
        String errorName = filename + errorExt;
        String pl0Name = filename + pl0Ext;
        for (int i = 0; i < files.length; i++) {
            if (!files[i].isFile()){
                continue;
            }

            String path = files[i].getPath();

            if (path.contains(errorName)){
                addInfo("Testing error file: " + path);
                if (errorFiles(path)) {

                    succesCount++;
                    addInfo("NO ERRORS FOUND");
                }else {
                    failCount++;
                    addError("File couldnt be translate to PL0");
                    readErrorFile(files[i]);
                }
                addSeparator();

            } else if (path.contains(pl0Name)){
                addInfo("Testing pl0 file: " + path);
                if (pl0Files(path)) {
                    succesCount++;
                    addInfo("NO ERRORS FOUND");

                }else {
                    failCount++;
                }
                addSeparator();
            }

        }
    }

    private static boolean errorFiles(String path) {
        if (!validTests.exists()) {
            addError("Valid test examples root directory doesnt exists " + validFiles);
            return false;
        }


        try {

            File newTest = new File(path);
            File output = new File(testOutput);
            int length = output.getAbsolutePath().length();
            String pathToValidTest = validTests.getAbsolutePath() + newTest.getAbsolutePath().substring(length);

            File validTest = new File (pathToValidTest);
            if (!validTest.exists() || validTest.isDirectory()){
                addError("Valid test is directory " + pathToValidTest);
                return false;
            }

            BufferedReader newTestsReader = new BufferedReader(new FileReader(newTest));
            BufferedReader validTestsReader = new BufferedReader(new FileReader(validTest));
            return comparePL0Files(newTestsReader, validTestsReader);

        }catch (IOException e) {
            addError("Error with reading pl0 files");
            e.printStackTrace();
        }

        return false;
    }

    private static boolean pl0Files(String path) {
        if (!validTests.exists()) {
            addError("Valid test examples root directory doesnt exists " + validFiles);
            return false;
        }


        try {

            File newTest = new File(path);
            File output = new File(testOutput);
            int length = output.getAbsolutePath().length();
            String pathToValidTest = validTests.getAbsolutePath() + newTest.getAbsolutePath().substring(length);

            File validTest = new File (pathToValidTest);
            if (!validTest.exists() || validTest.isDirectory()){
                addError("Valid test is directory " + pathToValidTest);
                return false;
            }

            BufferedReader newTestsReader = new BufferedReader(new FileReader(newTest));
            BufferedReader validTestsReader = new BufferedReader(new FileReader(validTest));
            return comparePL0Files(newTestsReader, validTestsReader);

        }catch (IOException e) {
            addError("Error with reading pl0 files");
            e.printStackTrace();
        }

        return false;
    }


    private static boolean comparePL0Files(BufferedReader newTestsReader, BufferedReader validTestsReader) throws IOException{

        String newTestLines;
        String validTestLines;
        boolean error = false;
        int lineNumber = 0;

        while ((newTestLines = newTestsReader.readLine()) != null) {
            lineNumber++;

            validTestLines = validTestsReader.readLine();
            if(validTestLines == null) {
                addError("Valid test is shorter than the new one, line: " + lineNumber);
                return false;
            }

            if (!compareLines(validTestLines, newTestLines, lineNumber)){
                error = true;
            }

        }

        return validTestsReader.readLine() == null && !error;
    }

    private static boolean compareLines(String validLine, String newLine, int lineNumber){

        if (validLine.length() != newLine.length()) {
            int min = Math.min(validLine.length(), newLine.length());
            addError(lineNumber, min, "Expected line: \"" + validLine + "\", but received: \"" + newLine + "\"");
            return false;
        }

        for (int i = 0 ; i != validLine.length() ; i++) {
            char chValid = validLine.charAt(i);
            char chNew = newLine.charAt(i);
            if (chValid != chNew) {
                addError(lineNumber, i, "Expected line: \"" + validLine + "\", but received: \"" + newLine + "\"");
                return false;
            }
        }

        return true;
    }


    private static void readErrorFile(File file) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String errorLine;

            while ((errorLine = reader.readLine()) != null) {
                addError(errorLine);
            }

        }catch (IOException e) {
            addError("Couldnt read parser error file: " + file.getPath());
        }


    }

    private static void cleanTestDirectory (File file) {
        if (!file.exists()){
            return;
        }

        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                cleanTestDirectory(f);
            }
        }

        file.delete();
    }

    private static void addInfo(String text) {
        String infoText = "-------------------- " + text + " --------------------" + "\n";
        System.out.print(infoText);
        errors += infoText ;
    }

    private static void addError(int line, int chNum, String text){
        String errorText = "Error at line " + line + ":" + chNum + " --- " + text + "\n";
        System.err.print(errorText);

        errors += errorText;
    }

    private static void addError(String text){
        String errorText = "Error --- " + text + "\n";
        System.err.print(errorText);

        errors += errorText;
    }

    private static void addSeparator(){
        String errorText = "\n\n\n\n";
        errors += errorText;
    }

    private static void writeError(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile));
            writer.write(errors);
            writer.flush();
            writer.close();

        }catch (IOException e) {
            addError("Couldnt create result file");
            e.printStackTrace();
        }
    }
}
