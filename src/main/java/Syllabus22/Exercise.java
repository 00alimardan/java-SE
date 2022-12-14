package Syllabus22;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter element: ");
        int n= scr.nextInt();

        List<List<Integer>> list=new ArrayList<>();
        list.add(List.of(12,46,23));
        list.add(List.of(21,5));
        list.add(List.of(90,45,29,50));
        list.add(List.of(1));

        for(List<Integer> index:list){
            if (index.contains(n)){
                System.out.println(list.indexOf(index)+","+index.indexOf(n));
            }
        }
    }
}
