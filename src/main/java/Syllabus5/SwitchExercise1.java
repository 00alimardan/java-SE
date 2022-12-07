package Syllabus5;

import java.util.Scanner;

public class SwitchExercise1 {
    public static void main(String[] args) {

        Scanner scr =new Scanner(System.in);
        System.out.print("Enter mark: ");
        int number =scr.nextInt();

        switch(number) {
            case 10:
                System.out.println(number+" = Sobresaliente");
                break;

            case 9:
                System.out.println(number+" = Sobresaliente");
                break;

            case 8:
                System.out.println(number+" = Notable");
                break;

            case 7:
                System.out.println(number+" = Notable");
                break;

            case 6:
                System.out.println(number+" = Bien");
                break;

            case 5:
                System.out.println(number+" = Aprobado");
                break;

            case 4:
                System.out.println(number+" = Suspenso");
                break;

            case 3:
                System.out.println(number+" = Suspenso");
                break;

            case 2:
                System.out.println(number+" = Suspenso");
                break;

            case 1:
                System.out.println(number+" = Suspenso");
                break;

            case 0:
                System.out.println(number+" = Suspenso");

        }

    }
}

