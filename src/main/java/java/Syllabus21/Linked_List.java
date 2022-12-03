package java.Syllabus21;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {
        List<Integer> linkList =new LinkedList<>();
        linkList.add(0,9);
        linkList.add(1,2);
        linkList.add(2,93);
        linkList.add(3,3);
        linkList.add(4,19);
        System.out.println("linklist="+linkList);

        Iterator<Integer> iterator =linkList.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
