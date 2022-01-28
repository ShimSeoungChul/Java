package 문자열인코딩;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringConstructor {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String text = " a ";
        if(text!=null && text.trim().length() > 0)
            System.out.println("OK");
    }
}
