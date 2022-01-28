package 문자열;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CollectorsJoiningDemo {
    public static void main(String[] args){
        String[] strArr = new String[] {"서울","부산","대구","전주"};
        String cities = Arrays.stream(strArr)
                .collect(Collectors.joining(","));  ;;//
        System.out.println(cities);

        String cities2 = Arrays.stream(strArr)
                .collect(Collectors.joining(",","(",")")); //prefix, suffix 지정
        System.out.println(cities2);
    }
}
