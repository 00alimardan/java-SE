package Syllabus6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter number: ");
        int f = scr.nextInt();
        int n=1;

        while (f>1) {
            f=f/n;
            n++;
        }
        System.out.println(n-1);
    }
}
