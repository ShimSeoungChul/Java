package 문자열인코딩;

import java.util.Locale;

public class formatTest {
    public static void main(String[] args){
        String text = "java";
        String text2 = new String("java");
        System.out.println(text==text2);
        text2 = text2.intern();
        System.out.println(text==text2);
    }
}
