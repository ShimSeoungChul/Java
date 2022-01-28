package 스트림;

import java.util.Arrays;
import java.util.List;

public class FilteringExam {
    public static void main(String[] args){
        List<String> vegetables = Arrays.asList("가지","무","배추","단호박","늙은호박","애호박");

        vegetables.stream()
                .distinct() // 중복제거
                .filter(s->s.contains("호박")) //필터링
                .forEach(System.out::println);
    }
}
