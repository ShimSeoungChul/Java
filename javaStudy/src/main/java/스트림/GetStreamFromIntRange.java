package 스트림;

import java.util.stream.IntStream;

public class GetStreamFromIntRange {
    public static void main(String[] args){
        IntStream intStream = IntStream.rangeClosed(1,100);
        intStream.forEach(i -> System.out.println(i));
    }
}
