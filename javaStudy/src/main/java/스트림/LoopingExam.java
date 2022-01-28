package 스트림;

import java.util.Arrays;

public class LoopingExam {
    public static void main(String[] args){
        int[] intArr = {1,2,3,4,5};

        //peek 동작하지 않음
        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(System.out::println);

        //peek 동작함
        int total = Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(System.out::println)
                .sum();
        System.out.println("총합:"+total);

        //forEach
        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .forEach(System.out::println);
    }
}
