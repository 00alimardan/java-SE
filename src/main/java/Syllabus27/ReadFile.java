package Syllabus27;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws Exception{
        File file=new File("paste file url");

        Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        }
    }

