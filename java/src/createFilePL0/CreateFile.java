package createFilePL0;

import java.io.BufferedWriter;
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

    public CreateFile(String fileName){
        try {
            this.filename = fileName;
            writerFile = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean writeToFile(String buffer){
        try {
            writerFile.write(buffer);
            writerFile.flush();

        } catch (IOException e) {
            System.out.println("couldnt write to file: " + filename);
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean eraseFile() {
        try {
            writerFile.close();
            Path path = Paths.get(filename);
            Files.delete(path);
        } catch (IOException e) {
            System.out.println("couldnt delete file: " + filename);
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
            System.out.println("couldnt close file: " + filename);
            e.printStackTrace();
        }
    }
}
