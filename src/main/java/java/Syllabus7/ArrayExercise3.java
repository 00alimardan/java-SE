package java.Syllabus7;

import java.util.Scanner;

public class ArrayExercise3 {
    public static void main(String[] args) {

        int sum=0;

        Scanner scr= new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n= scr.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (n=0;n<arr.length;n++) {
            arr[n]=scr.nextInt();
        }

        System.out.println("Array elements: ");
        for (n=0;n<arr.length;n++) {
            System.out.print(arr[n]+" ");

            sum=sum+arr[n];
        }
        System.out.println();
        System.out.println("sum: "+sum);
        System.out.println("average: "+sum/arr.length);
    }
}