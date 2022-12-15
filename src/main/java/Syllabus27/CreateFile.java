package Syllabus27;

import java.io.File;
import java.io.IOException;


public class CreateFile {
    public static void main(String[] args) throws IOException, RuntimeException {
        File file=new File("paste file url");

        if (file.exists()){
            System.out.println("This file already exist.");
        }
        else {
            file.createNewFile();
            System.out.println("The file has been created.");
        }
    }
}
