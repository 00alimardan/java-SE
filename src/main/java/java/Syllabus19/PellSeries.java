package java.Syllabus19;

import java.util.Scanner;

public class PellSeries {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter number of Pell series: ");
        int NumOfPell= scr.nextInt();
        int firstNum=0,secondNum=1;
        System.out.printf("%s, %s",firstNum,secondNum);
        int index=0,nextIndex=0,n=0;

        while (index<NumOfPell-2){
            nextIndex=firstNum+2*secondNum;
            System.out.printf(", %s",nextIndex);

            n=secondNum;//1
            secondNum=nextIndex;//2
            firstNum=n;//1
            index++;//1
        }
    }
}
