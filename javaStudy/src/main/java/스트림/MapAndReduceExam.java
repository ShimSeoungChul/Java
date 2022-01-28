package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapAndReduceExam {
    public static void main(String args[]){
        List<Vegetable> vegetables = Arrays.asList(
                new Vegetable("broccoli",0.3),
                new Vegetable("tomato",0.2),
                new Vegetable("cabbage",2.0),
                new Vegetable("eggplant",0.5)
        );

        //순차 처리
        Stream<Vegetable> stream = vegetables.stream();
        double average = stream
                .mapToDouble(Vegetable :: getKg) //중간처리: 야채 객체를 무게로 매핑
                .average() //최종 처리(평균 점수)
                .getAsDouble();
        System.out.println(average);
    }
    static class Vegetable{
        String name;
        double kg;

        Vegetable(String name, double kg){
            this.name = name;
            this.kg = kg;
        }

        public String getName() {
            return name;
        }

        public double getKg() {
            return kg;
        }
    }
}
