package Syllabus22;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Set<Integer> arrList=new HashSet<>();
        arrList.add(21);
        arrList.add(12);
        arrList.add(34);
        arrList.add(43);



//        for (int i=0;i<arrList.size();i++)
//            if (arrList.contains(12))
//            System.out.println(i);


        List<Integer> arrList1=new ArrayList<>();
        arrList1.add(21);
        arrList1.add(12);
        arrList1.add(34);
        arrList1.add(43);

//        for (int j=0;j< arrList1.size();j++)
//            if (arrList1.get(j)==34)
//            System.out.println(j);
Scanner scr=new Scanner(System.in);
System.out.print("Enter element: ");
int n= scr.nextInt();
int h=0;

        List<List<Integer>> list=new ArrayList<>();
        list.add(List.of(12,46,23));
        list.add(List.of(21,5));
        list.add(List.of(90,45,29,50));
        list.add(List.of(1));


        for (int k=0;k< list.size();k++) {
            if (list.get(k).get(h) == n) {
                System.out.println(k + "," + h);
            }
        }
    }
}
