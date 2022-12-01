package java.Syllabus11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkPassword {
    private String password;
//    public checkPassword(String password) {
//        this.password=password;
//    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password=CorrectPassword(password);
    }

    public String CorrectPassword(String password) {
        if (password.length()<10)
            System.out.println("A password must have at least ten characters !!!");

        else if(!checkSymbols(password))
            System.out.println("A password consists of only letters and digits !!!");

        else if (!checkLetters(password))
            System.out.println("Wrong password: Enter digits !!!");

        else if (!checkDigits(password))
            System.out.println("Wrong password: Enter letters !!!");

        else if (CountOfDigits(password))
            System.out.println("A password must contain at least two digits !!!");

        else
            System.out.println(password+"\nYour password is true.");

        return "";
    }

    public boolean checkSymbols(String password) {
        Pattern p=Pattern.compile("[^A-Za-z0-9]");
        Matcher m=p.matcher(password);
        if (m.find())
            return false;

        else return true;
    }

    public static boolean checkLetters(String password) {
        boolean key = false;
        if (password.matches(".*[a-zA-Z].*"))
            key=true;

        return key;
    }

    public static boolean checkDigits(String password) {
        boolean key = false;
        if (password.matches(".*[0-9].*"))
            key=true;

        return key;
    }

    public static boolean CountOfDigits(String password) {
        boolean key = false;
        int digits=0;
        for (int i=0;i<password.length();i++) {
            if(Character.isDigit(password.charAt(i)))
                digits++;
        }
        if (digits<2)
            key=true;

        return key;
    }

}
