package 스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExam {
    public static void main(String[] args){
        //문장을 어절로 나누기
        List<String> line = Arrays.asList("애호박 무침은 고소하다","노각 무침은 아삭하다");
        line.stream()
            .flatMap(data -> Arrays.stream(data.split(" ")))
            .forEach(System.out::println);

        //문장을 숫자로 나누기
        List<String> line2 = Arrays.asList("10,20,30","40,50,60");
        line2.stream()
             .flatMapToInt(data -> {
                     String[] strArr = data.split(",");
                     int[] numbers = new int[strArr.length];
                     for(int i=0;i<strArr.length;i++)
                         numbers[i] = Integer.parseInt(strArr[i]);
                     return Arrays.stream(numbers);
             }).forEach(System.out::println);
    }
}
