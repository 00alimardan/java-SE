package Syllabus27;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
    public static void main(String[] args) throws IOException, RuntimeException {
        File file=new File("paste file url");
        try (FileWriter writer = new FileWriter(file)) {

            writer.write("I");
            writer.write(" write ");
            writer.write("my file.");
        }
    }
}
