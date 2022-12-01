package java.Syllabus17;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String str = sc.nextLine();
        String[] arr=str.split("[ ]");
        String sortedStr="";
        for (int i=0;i< arr.length;i++){
            char charArray[] = arr[i].toCharArray();
            String[] a=new String[charArray.length];
            for (int j=0;j< charArray.length;j++){
                a[j]=String.valueOf(charArray[j]);
            }
            Arrays.sort(a,String.CASE_INSENSITIVE_ORDER);
            String string="";
            for (int k=0;k<a.length;k++){
                string=string+a[k];
            }
            sortedStr=sortedStr+string+" ";
        }

        System.out.println(sortedStr);
    }
}
