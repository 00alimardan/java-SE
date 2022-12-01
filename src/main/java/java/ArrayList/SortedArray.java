package java.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SortedArray {
    public static void main(String[] args) {
        List<Integer> ints= new ArrayList<>();
        ints.add(4);
        ints.add(6);
        ints.add(78);
        ints.add(56);

        int k,i,j;
        for (i=0;i<ints.size();i++){
            for(j=i+1;j<ints.size();j++){
                if (ints.get(i)>ints.get(j)) {
                    k=ints.get(i);
                    ints.set(i,ints.get(j));
                    ints.set(j,k);
                }
            }
        }
        System.out.println(ints);
    }
}
