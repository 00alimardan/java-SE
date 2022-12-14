package ExceptionType.Built_inExceptions;

public class Describe_exception {
    public static void main(String[] args)  {
        System.out.println();
        int a=5;
        int b=0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("hello");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();// hansı Exception olduğunu göstərir
        }
    }
}
