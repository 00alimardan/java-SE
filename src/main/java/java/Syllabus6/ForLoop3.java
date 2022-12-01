package java.Syllabus6;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter number: ");
        int i= scr.nextInt();
        int n=0,f=1;
        System.out.print(i+"!= ");
        for (n=i;n>0;n--) {
            f=f*n;
            System.out.print(n+" x ");
        }
        System.out.print("="+f);
    }
}
