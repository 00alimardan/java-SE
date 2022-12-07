package Syllabus14;

import java.util.Scanner;

public class AlgorithmicExercises {
    public static void main(String[] args) {
        int n,a;
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scr.nextInt();
        a=rows-1;

        for (int i=1;i<=rows;i++){
            for (n=a;n>0;n--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
            a--;
        }
    }
}
//   1
//  2 2
// 3 3 3
//4 4 4 4
