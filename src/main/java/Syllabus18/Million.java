package Syllabus18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Million {
    public static void main(String[] args) {
        List<Integer> data=getDate();
        for(int i=1;i<=150;i++){
            System.out.printf("%s - %s\n",i,countElm(i,data));
        }
    }
    public static List<Integer> getDate(){
        List<Integer> list=new ArrayList<>();
        Random rn=new Random();
        for (int i=0;i<10_000_000;i++){
            list.add(rn.nextInt(150)+1);
        }
        return list;
    }
    public static int countElm(int i,List<Integer> listt){
        return Collections.frequency(listt,i);
    }
}
