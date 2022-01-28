package 스트림.매핑;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class SortedExam {
    public static void main(String[] args){
        List<Vegetable> vegetables = Arrays.asList(
                new Vegetable("broccoli",0.3),
                new Vegetable("tomato",0.2),
                new Vegetable("eggplant",0.5)
        );
        Stream<Vegetable> stream = vegetables.stream();
        //정렬

        stream.sorted().forEach(v -> System.out.println(v.name + ":" + v.kg));
        stream.sorted((a,b)->a.compareTo(b)).forEach(v -> System.out.println(v.name + ":" + v.kg));
        stream.sorted(Comparator.naturalOrder()).forEach(v -> System.out.println(v.name + ":" + v.kg));
    }

    static class Vegetable implements Comparable<Vegetable>{
        private String name;
        private double kg;

        Vegetable(String name, double kg){
            this.name = name;
            this.kg = kg;
        }

        @Override
        public int compareTo(Vegetable o) {
            return Double.compare(kg, o.kg);
            // score < o.score 음수 리턴
            // score == o.score 0 리턴
            // score > o.score 양수 리턴
        }
    }
}