package 스트림.집계;

import java.util.Arrays;

public class AggregateDemo {
    public static void main(String[] args){
        int[] intArray = new int[] {1,2,3,4,5};

        long count = Arrays.stream(intArray).count();
        long sum = Arrays.stream(intArray).sum();
        Double average = Arrays.stream(intArray).average().getAsDouble();
        long max = Arrays.stream(intArray).max().getAsInt();
        int first = Arrays.stream(intArray).findFirst().getAsInt();

        System.out.println("count:"+count);
        System.out.println("sum:"+sum);
        System.out.println("average:"+average);
        System.out.println("max:"+max);
        System.out.println("first:"+first);
    }
}
