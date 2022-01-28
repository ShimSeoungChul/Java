package 스트림.매핑;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
    public static void main(String[] args){
        List<String> line = Arrays.asList("10,20,30","40,50,60");

        line.stream()
                .flatMap(data-> {
                    String[] strArr = data.split(",");
                    return Arrays.stream(strArr);
                })
                .mapToInt(Integer::parseInt)
                .forEach(System.out::println);
    }
}
