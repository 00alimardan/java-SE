package ExceptionType.UserDefined_Exceptions;

public class MyException extends Exception {
    public static final int[] customerID ={98, 99, 100, 101, 102};
    private static final String[] names={"John", "Micheal", "Jennifer", "Angelina", "Rose"};
    private static final double[] balance={150.345, 200.0, 40.23, 999.12, 409.02};

    public MyException(String str) {
        super(str);
    }

    public static void main(String[] args) throws MyException {

            System.out.println("CustomerID" + "\t" + "CustomerName" + "\t" + "CustomerBalance");
            for (int i = 0; i < 5; i++) {
                System.out.println(customerID[i] + "        \t" + names[i] + "              \t" + balance[i]);

                if (balance[i] < 100) {
                    MyException myEx = new MyException("Balance can't be less than 100");
                    throw myEx;

                }
            }


//                   ******OTHER WAY*******
//        try {
//            System.out.println("CustomerID" + "\t" + "CustomerName" + "\t" + "CustomerBalance");
//            for (int i = 0; i < 5; i++) {
//                System.out.println(customerID[i] + "        \t" + names[i] + "              \t" + balance[i]);
//
//                if (balance[i] < 100) {
//                    MyException myEx = new MyException("Balance can't be less than 100");
//                    throw myEx;
//                }
//            }
//        }catch (MyException e){
//            e.printStackTrace();
//        }
    }
}
