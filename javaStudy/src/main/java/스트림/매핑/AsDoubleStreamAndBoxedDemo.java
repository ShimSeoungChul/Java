package 스트림.매핑;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedDemo {
    public static void main(String[] args){
        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.asDoubleStream() //DoubleStream생성
                .forEach(System.out::println);

        intStream = Arrays.stream(intArray);
        intStream.boxed() //Stream<Integer> 생성
                .forEach(obj-> System.out.println(obj.intValue()));
    }
}
