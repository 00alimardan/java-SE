package Syllabus22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter index: ");
        int a= scr.nextInt();
        int b= scr.nextInt();

        findIndexByElement(a,b);

    }

    public static void findIndexByElement(int i,int j){
        List<List<Integer>> arr= new ArrayList<>();
        arr.add(List.of(41, 77, 74, 22, 44));
        arr.add(List.of(14, 82));
        arr.add(List.of(5, 9, 12, 41));
        arr.add(List.of(1));

        System.out.println(arr.get(i).get(j));
        System.out.println(i+","+j);
    }
}
