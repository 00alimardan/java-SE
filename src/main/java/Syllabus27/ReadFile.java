package Syllabus27;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws Exception{
        File file=new File("C:/Users/malahat/IdeaProjects/java-home/src/main/resources/TestForFile.txt");

        Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        }
    }

