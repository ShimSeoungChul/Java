package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExam {
    public static void main(String args[]){
        List<String> vegetables = Arrays.asList("broccoli","tomato","cabbage","eggplant");

        //순차 처리
        Stream<String> stream = vegetables.stream();
        stream.forEach(ParallelExam :: print); //메서드참조

        //병렬 처리
        Stream<String> parallelStream = vegetables.stream();
        parallelStream.forEach(ParallelExam::print);
    }
    public static void print(String str){
        System.out.println(str+ " : " + Thread.currentThread().getName());
    }
}
