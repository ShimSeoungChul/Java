package 스트림.집계;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args){
        List<Vegetable> vegetableList = Arrays.asList(
                new Vegetable("broccoli",0.3),
                new Vegetable("tomato",0.2),
                new Vegetable("cabbage",2.0),
                new Vegetable("eggplant",0.5)
        );
        // sum() 이용
        Double sum1 = vegetableList.stream()
                .mapToDouble(Vegetable::getKg)
                .sum();

        // reduce(DoubleBinaryOperator op) 이용
        Double sum2 = vegetableList.stream()
                .map(Vegetable::getKg)
                .reduce((a,b)->a+b) //스트림에 요소가 없을 경우 NoSuchElementException 발생
                .get();

        // reduce(double identity, DoubleBinaryOperator op) 이용
        Double sum3 = vegetableList.stream()
                .map(Vegetable::getKg)
                .reduce(0.0, (a,b)->a+b); //스트림에 요소가 없을 경우 디폴트 값(identity) 리턴

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
    static class Vegetable{

        String name;
        double kg;

        Vegetable(String name, double kg ){
            this.name = name;
            this.kg = kg;
        }
        public double getKg() {
            return kg;
        }
    }
}
