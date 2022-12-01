package java.Syllabus5;

import java.util.Scanner;

public class SwitchExercise2 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter mark: ");
        int mark = scr.nextInt();

        if(mark==10 || mark==9)
            System.out.println("Sobresaliente");

        else if(mark==8 || mark==7)
            System.out.println("Notable");

        else if(mark==6)
            System.out.println("Bien");

        else if(mark==5)
            System.out.println("Aprobado");

        else if(mark==4 || mark==3 || mark==2 || mark==1 || mark==0)
            System.out.println("Suspenso");
    }
}
