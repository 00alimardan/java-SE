package java.Syllabus17;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

    Pattern pattern = Pattern.compile("salam",Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("SaLam dunya");
    System.out.println(matcher.find());


    String s = "Hello0Regular1Expression.Test";
    System.out.println(Arrays.toString(s.split("[0-9.]")));

    String s1 = "Hello Regular Expression.Test";
    System.out.println(Arrays.toString(s1.split("[' '.]")));


    Pattern pattern3=Pattern.compile("[^A-Z]");
    Matcher matcher3=pattern3.matcher("hello");
    System.out.println(matcher3.find());
    }
}
