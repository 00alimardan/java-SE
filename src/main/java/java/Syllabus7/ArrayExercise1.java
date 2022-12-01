package java.Syllabus7;

import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int i= scr.nextInt();

        int[] arr = new int[i];
        int j,k;
        System.out.println("Enter elements of array: ");
        for (i=0;i<arr.length;i++) {
            arr[i]=scr.nextInt();
        }
        for (i=0;i<arr.length;i++) {
            for (j=i+1;j<arr.length;j++) {
                if (arr[i]>arr[j]) {
                    k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
        }
        System.out.println("Array elements from smallest to largest: ");
        for (i=0;i<arr.length;i++)
            System.out.print(arr[i] +" ");
    }
}
