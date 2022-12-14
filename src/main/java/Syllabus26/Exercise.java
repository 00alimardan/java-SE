package Syllabus26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        try {
            System.out.print("Enter first element: ");
            int a = scr.nextInt();
            System.out.print("Enter second element: ");
            int b = scr.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("Enter element in int type.");
            System.out.println(e.toString());

        } catch (ArithmeticException e) {
            System.out.println("Second number can't be zero!");
            System.out.println(e.toString());
        }
    }
}
