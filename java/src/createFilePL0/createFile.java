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
public class createFile {
    private BufferedWriter writerFile;
    private String filename;

    public createFile(String fileName){
        try {
            this.filename = fileName;
            writerFile = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean writeToFile(CodeBuffer buffer){
        try {
            writerFile.write(buffer.getContent());
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
}
