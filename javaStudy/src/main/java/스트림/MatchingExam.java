package 스트림;

import java.util.Arrays;

public class MatchingExam {
    public static void main(String[] args){
        int[] arr = {2,4,6};

        boolean isTrue = Arrays.stream(arr)
                .allMatch(a->a%2==0);
        System.out.println("모두 2의 배수인가? " + isTrue);

        isTrue = Arrays.stream(arr)
                .anyMatch(a->a%3==0);
        System.out.println("하나라도 3의 배수가 있는가? " + isTrue);

        isTrue = Arrays.stream(arr)
                .noneMatch(a->a%3==0);
        System.out.println("3의 배수가 없는가? " + isTrue);
    }
}
