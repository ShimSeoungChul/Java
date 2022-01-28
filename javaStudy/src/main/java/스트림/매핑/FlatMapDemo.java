package 스트림.매핑;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapDemo {
    public static void main(String[] args){
        List<String> line = Arrays.asList("10,20,30","40,50,60");

        line.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] numbers = new int[strArr.length];
                    for(int i=0;i<strArr.length;i++)
                        numbers[i] = Integer.parseInt(strArr[i]);
                    return Arrays.stream(numbers);
                }).forEach(System.out::println);
    }
}
