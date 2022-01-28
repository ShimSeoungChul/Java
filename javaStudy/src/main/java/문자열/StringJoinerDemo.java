package 문자열;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args){
        String[] strArr = new String[] {"서울","부산","대구","전주"};
        StringJoiner joiner = new StringJoiner(" ,");
        for(String str: strArr)
            joiner.add(str);
        System.out.println(joiner);

        StringJoiner joiner2 = new StringJoiner(" ,","(",")"); //prefix, suffix 지정
        for(String str: strArr)
            joiner2.add(str);
        System.out.println(joiner2);
    }
}
