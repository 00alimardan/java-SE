package java.Syllabus6;

import java.util.Scanner;

public class ForLoop6 {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int i= scr.nextInt();
        System.out.print("Enter last number: ");
        int x= scr.nextInt();
        int n=0;
        System.out.print("input: ");
        for(n=i;n<=x;n++) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.print("output: ");
        for(n=x;n>=i;n--) {
            System.out.print(n+" ");
        }
    }
}
