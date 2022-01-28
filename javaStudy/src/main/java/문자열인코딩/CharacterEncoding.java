package 문자열인코딩;

import java.io.UnsupportedEncodingException;

public class CharacterEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        CharacterEncoding characterEncoding = new CharacterEncoding();
        String english = "Hello";
        String hangul = "안녕하세요";
        String encodingType = "utf-8";
        characterEncoding.printText(english,encodingType);
        characterEncoding.printText(hangul,encodingType);
    }

    public void printText(String text, String encodingType) throws UnsupportedEncodingException {
        byte [] byteDate = text.getBytes(encodingType);

        StringBuilder hexStringBuilder = new StringBuilder();
        StringBuilder decStringBuilder = new StringBuilder();

        for (byte c : byteDate) {
            int decimal = c & 0xff;
            decStringBuilder.append(decimal).append(" ");
            hexStringBuilder.append(Integer.toString(decimal+ 0x100, 16).substring(1)).append(" ");
        }

        System.out.println("문자열 '" + text+ "'의 길이:"+text.length());
        System.out.println("문자를 표현하는 데 사용한 바이트 수:"+text.getBytes(encodingType).length);
        System.out.println("16진수 값:"+hexStringBuilder);
        System.out.println("10진수 값:"+decStringBuilder);
    }
}
