package Syllabus12;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n= scr.nextInt();

        int[][] arr=new int[n][n];
        System.out.println("Enter array: ");

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]= scr.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
