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

    }
}
