package Syllabus23;

import java.util.*;
import java.util.Map.Entry;

public class Exercise {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> mapArr=new HashMap<>();
        mapArr.put(0,new ArrayList<>(List.of(4,5,8)));
        mapArr.put(1,new ArrayList<>(List.of(2,1,9)));

        Scanner scr=new Scanner(System.in);
        System.out.print("Enter element: ");
        int k= scr.nextInt();



//        for(Entry index: mapArr.entrySet()){
//            System.out.println(index.getKey()+": "+index.getValue());
//        }

//        for (Entry<Integer, List<Integer>> index: mapArr.entrySet()) {
//            System.out.println(index.getKey());
//        }
    }
}
