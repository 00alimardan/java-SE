package Syllabus6;

public class WhileLoop {
    public static void main(String[] args) {
        int n=0,a,b,c;
        System.out.print("Armstrong numbers: ");
        while(n<500) {
           n++;
           a=n/100;
           b=(n%100)/10;
           c=n%10;
           if((a*a*a)+(b*b*b)+(c*c*c)==n) {
               System.out.print(n+" ");
           }
        }
    }
}
