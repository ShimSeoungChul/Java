package 메소드참조;

import java.util.Arrays;
import java.util.stream.Stream;

interface MakeString{
    String fromBytes(char[] chars);
}

public class MethodReferenceDemo {
    public static void main(String[] args){
        MethodReferenceDemo demo = new MethodReferenceDemo();
        String[] strArr = {"str1","str2","str3"};
        demo.objectReference(strArr);
    }

    private void createInstance(){
        MakeString makeString = String::new;
        char[] chars = {'a','b','c'};
        String madeString = makeString.fromBytes(chars);
        System.out.println(madeString);
    }

    private static void printResult(String value){
        System.out.println(value);
    }

    private void staticReference(String[] strArr){
        Stream.of(strArr).forEach(MethodReferenceDemo::printResult);
    }

    private void objectReference(String[] strArr){
        Arrays.sort(strArr, String::compareToIgnoreCase); //임의 객체 참조
        Arrays.asList(strArr).stream().forEach(System.out::println); //인스턴스 메서드 참조
    }
}
