package Syllabus17;

public class WrapperClasses {
    public static void main(String[] args) {
        // boolean , byte, short, char,      int,     double, float, long
        // Boolean , Byte, Short, Character, Integer, Double, Float, Long

        Integer i=1000;
        Character ch='a';
        System.out.println(i.intValue());
        String s=i.toString();
        System.out.println(s.length());
        System.out.println(i.floatValue());
        System.out.println(Integer.numberOfLeadingZeros(8));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(i.TYPE);
        System.out.println(ch.TYPE);
        System.out.println(i.toString(5,-78));
        System.out.println(Character.MIN_RADIX);
        System.out.println(Character.MAX_RADIX);


        //boxing
        int h=45;
        Integer h1=h;
        System.out.println(h1);

        //unboxing
        Boolean b=true;
        boolean b1=b;
        System.out.println(b1);
    }
}
