package Syllabus22;

import java.util.*;

public class JavaSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("hello");
        set.add("java");
        set.add("world");
        set.add("JavaSet");
        System.out.println(set);

        List<String> list=new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(1));



        Set<Integer> a = new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> b = new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
}
