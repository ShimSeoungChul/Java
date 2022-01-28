package 스트림.필터링;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {
    public static void main(String[] args){
        List<String> vegetables = Arrays.asList("가지","무","배추","가지","가지","애호박");
        vegetables.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
