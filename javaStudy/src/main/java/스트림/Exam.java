package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam {
    public static void main(String[] arsgs){
        String[] vegetables = {"broccoli","tomato","cabbage"};
        Stream<String> stream = Arrays.stream(vegetables);
        stream.forEach(s-> System.out.println(s));
    }
}
