package 이펙티브자바.아이템18;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args){
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("틱","탁탁","펑"));
        System.out.println(s.getAddCount());

        InstrumentedSet<String> a = new InstrumentedSet<>(new HashSet<>());
        a.addAll(List.of("틱","탁탁","펑"));
        System.out.println(a.getAddCount());

    }
}
