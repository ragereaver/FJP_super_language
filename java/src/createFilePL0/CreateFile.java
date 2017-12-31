package createFilePL0;

import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class CreateFile {
    private BufferedWriter writerFile;
    private String filename;
    private String newFilename;

    public CreateFile(String filename){
        this.filename = filename;
        this.newFilename = "";
    }

    private void openFile(boolean isAppend) throws IOException{
        if (writerFile != null) {
            close();
        }

        writerFile = new BufferedWriter(new FileWriter(newFilename, isAppend));

    }

    private void validateFilename(){
        File file = new File(filename);

        if (file.exists() && file.isDirectory() ) {
            String name = getFilename(TableOfSymbols.filepath);
            filename += name;
        }
    }

    public boolean writeToFile(String buffer){
        validateFilename();
        try {
            if(ErrorHandle.hasError()){
                newFilename = getNewFilePath("-errors", "log");
                buffer = ErrorHandle.createString();

                //jen pro testovani
                System.err.println("Error was found so I created error file instead: " + newFilename);
                System.err.println(ErrorHandle.createString());

            }else {
                newFilename = getNewFilePath("", "pl");
            }

            openFile(false);
            writerFile.write(buffer);
            writerFile.flush();

        } catch (IOException e) {
            System.err.println("Couldnt write to file: " + newFilename);
            e.printStackTrace();
            return false;
        }

        return true;
    }


    private String getNewFilePath (String newName, String ext) {
        File file = new File(filename);
        String absolutePath = file.getAbsolutePath();
        String filePath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
        String origName = absolutePath.substring(
                    absolutePath.lastIndexOf(File.separator), absolutePath.lastIndexOf("."));
        filePath += origName + newName + "." + ext;

        return filePath;
    }

    public String getFilename (String path) {
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        String fileName = absolutePath.substring(absolutePath.lastIndexOf(File.separator), absolutePath.length());

        return fileName;
    }

    public static String getFilenameWithoutExtension (String path) {
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        String fileName = absolutePath.substring(absolutePath.lastIndexOf(File.separator), absolutePath.length());

        if (fileName.contains(".")){
            fileName = fileName.substring(0, fileName.lastIndexOf("."));
        }


        return fileName;
    }

    public boolean eraseFile() {
        try {
            writerFile.close();
            Path path = Paths.get(filename);
            Files.delete(path);
        } catch (IOException e) {
            System.err.println("couldnt delete file: " + filename);
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public void close (){
        try {
            writerFile.flush();
            writerFile.close();
        } catch (IOException e) {
            System.err.println("couldnt close file: " + filename);
            e.printStackTrace();
        }
    }

    public static String getExtension(File file){
        String absolutePath = file.getAbsolutePath();
        if (absolutePath.lastIndexOf(".") > 0) {
            String ext = absolutePath.substring(absolutePath.lastIndexOf("."), absolutePath.length());
            return ext;
        }

        return null;
    }
}
