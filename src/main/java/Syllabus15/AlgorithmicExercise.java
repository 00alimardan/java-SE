package Syllabus15;

import java.util.Scanner;

public class AlgorithmicExercise {
    public static void main(String[] args) {
        int n,a;
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scr.nextInt();
        a=rows-1;

        for (int i=0;i<rows;i++){
            for (n=a;n>0;n--){
                System.out.print(" ");
            }
            for(int j=0;j<1+(i*2);j++){
                System.out.print("*");
            }
            System.out.println();
            a--;
        }

        int b=0;
        for(int i=rows-1;i>=0;i--){
            for (n=0;n<b;n++){
                System.out.print(" ");
            }
            for (int j=0;j<1+(i*2);j++){
                System.out.print("*");
            }
            System.out.println();
            b++;
        }
    }
}
//  *
// ***
//*****
