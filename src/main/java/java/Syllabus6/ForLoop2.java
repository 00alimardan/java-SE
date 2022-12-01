package java.Syllabus6;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter number: ");
        int a= scr.nextInt();
        int i=0,c=0;
        for (i=0;i<=10;i++) {
            c=a*i;
            System.out.println(a+" x "+i+" = "+c);
        }
    }
}
