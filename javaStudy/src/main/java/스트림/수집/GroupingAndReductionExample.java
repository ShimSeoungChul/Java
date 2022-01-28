package 스트림.수집;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {
    public static void main(String[] args){
        List<Vegetable> vegetables = Arrays.asList(
                new Vegetable("broccoli",0.3,Vegetable.Color.GREEN),
                new Vegetable("tomato",0.2, Vegetable.Color.RED),
                new Vegetable("redPepper",0.1,Vegetable.Color.RED),
                new Vegetable("cabbage",2.0,Vegetable.Color.GREEN),
                new Vegetable("eggplant",0.5,Vegetable.Color.PURPLE)
        );

        //1. 그룹핑 절차 그대로 보여주기
        //야채의 색상별 평균 무게를 저장하는 Map 얻기
        Function<Vegetable, Vegetable.Color> classifier = Vegetable :: getColor;
        ToDoubleFunction<Vegetable> mapper = Vegetable::getKg;
        Collector<Vegetable, ?, Double> collector1 = Collectors.averagingDouble(mapper);
        Collector<Vegetable, ?, Map<Vegetable.Color, Double>> collector2 = Collectors.groupingBy(classifier, collector1);
        Map<Vegetable.Color, Double> mapByColor = vegetables.stream().collect(collector2);

        System.out.println("초록색 야채 전체 평균:" + mapByColor.get(Vegetable.Color.GREEN));
        System.out.println("빨간색 야채 전체 평균:" + mapByColor.get(Vegetable.Color.RED));
        System.out.println("보라색 야채 전체 평균:" + mapByColor.get(Vegetable.Color.PURPLE));

        //2. 변수 생략으로 간단하게 표현하기
        //야채의 색상을 쉽표로 구분한 이름을 저장하는 Map 얻기
        Map<Vegetable.Color, String> mapByName = vegetables.stream()
                .collect(
                        Collectors.groupingBy(
                                Vegetable :: getColor,
                                Collectors.mapping(Vegetable :: getName, Collectors.joining(","))
                        )
                );

        System.out.println("초록색 야채 전체 이름:" + mapByName.get(Vegetable.Color.GREEN));
        System.out.println("빨간색 야채 전체 이름:" + mapByName.get(Vegetable.Color.RED));
        System.out.println("보라색 야채 전체 이름:" + mapByName.get(Vegetable.Color.PURPLE));
    }
}
