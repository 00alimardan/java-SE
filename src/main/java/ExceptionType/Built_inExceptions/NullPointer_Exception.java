package ExceptionType.Built_inExceptions;

public class NullPointer_Exception {
    public static void main(String[] args) {
        String str=null;
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("hello");
        }
    }
}
