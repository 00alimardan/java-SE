package java.Syllabus21;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<Integer> arrList1 =new ArrayList<>();
        arrList1.add(0,4);
        arrList1.add(1,2);
        arrList1.add(2,49);
        arrList1.add(3,12);
        arrList1.add(4,56);
        arrList1.add(5,1);
        System.out.println("arrList1"+"="+arrList1);

        List<Integer> arrList2 =new ArrayList<>();
        arrList2.addAll(arrList1);
        System.out.println("arrList2"+"="+arrList2);
//        or
//        List<Integer> arrList2 =new ArrayList<>(arrList1);
//        System.out.println(arrList2);

        List<Integer> arrList3 =new ArrayList<>();
        arrList3.add(0,12);
        arrList3.add(1,6);
        arrList3.add(2,100);
        arrList3.add(3,21);
        arrList3.add(4,99);
        arrList3.add(5,3);
//        arrList3.clear(); or arrList3.removeAll(arrList3);
        System.out.println("arrList3"+"="+arrList3);

        arrList3.set(3,5);
        arrList3.set(0,76);
        System.out.println("New_arrList3"+"="+arrList3);
        arrList3.remove(5);
        System.out.println("New_arrList3"+"="+arrList3);
        arrList3.add(1,30);
        System.out.println("New_arrList3"+"="+arrList3);
        System.out.println("3rd index element: "+arrList3.get(3));


        List<String > stringList =new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Java");
        stringList.add("World");
        System.out.println("stringList"+"="+stringList);

        for (String s : stringList) {
            System.out.print(s + " ");
        }
    }
}
