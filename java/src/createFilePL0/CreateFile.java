package createFilePL0;

import tableClasses.ErrorHandle;

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

    public CreateFile(String filename){
        try {
            this.filename = filename;
            openFile(filename, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openFile(String filename, boolean isAppend) throws IOException{
        if (writerFile != null) {
            close();
        }

        writerFile = new BufferedWriter(new FileWriter(filename, isAppend));
    }

    public boolean writeToFile(String buffer){
        try {
            if(ErrorHandle.hasError()){
                writeErrorFile();
            }else {
                writerFile.write(buffer);
                writerFile.flush();
            }

        } catch (IOException e) {
            System.err.println("Couldnt write to file: " + filename);
            e.printStackTrace();
            return false;
        }

        return true;
    }

    private void writeErrorFile() throws IOException{
        File file = new File(filename);
        String absolutePath = file.getAbsolutePath();
        String filePath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
        filePath += File.separator + "errors.log";

        openFile(filePath, false);
        System.err.println("Error was found so I created error file instead: " + filePath);
        writerFile.write(ErrorHandle.createString());
        writerFile.flush();
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
}
