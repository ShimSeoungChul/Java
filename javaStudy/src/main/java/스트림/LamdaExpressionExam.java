package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionExam {
    public static void main(String[] args){
        List<String> vegetables = Arrays.asList("broccoli","tomato","cabbage");

        Stream<String> stream = vegetables.stream();
        stream.forEach(s -> {
            System.out.println(s);
        });
    }
}
