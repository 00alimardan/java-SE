package java.Syllabus8;

import java.util.Scanner;

public class MethodExercise1 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter symbol: ");
        String s= scr.nextLine();
        System.out.println("Middle number is: "+middle(s));
    }
    public static String middle(String s) {
        int a,b;

        if (s.length()%2==1) {
            a=s.length()/2;
            b=1;
        }
        else {
            a=s.length()/2-1;
            b=2;
        }
        return s.substring(a,a+b);
    }
}
