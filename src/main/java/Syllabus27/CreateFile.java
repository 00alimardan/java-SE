package Syllabus27;

import java.io.File;
import java.io.IOException;


public class CreateFile {
    public static void main(String[] args) throws IOException, RuntimeException {
        File file=new File("C:/Users/malahat/IdeaProjects/java-home/src/main/resources/TestForFile.txt");

        if (file.exists()){
            System.out.println("This file already exist");
        }
        else file.createNewFile();
    }
}
