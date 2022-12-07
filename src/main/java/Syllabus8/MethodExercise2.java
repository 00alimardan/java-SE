package Syllabus8;

import java.util.Scanner;

public class MethodExercise2 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Input string: ");
        String s= scr.nextLine();
        System.out.print("Vowels counts are: "+vCount(s));
    }
    public static int vCount(String s) {
        int i,count=0;
        s=s.toLowerCase();
        for (i=0;i<s.length();i++) {
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                count++;
        }
        return count;
    }
}
