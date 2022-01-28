package 스트림;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PipeLineExam {
    public static void main(String[] args){
        Member[] members = {new Member(20, "남"),
                new Member(20, "여"),
                new Member(30, "남"),
                new Member(30, "여"),
                new Member(40, "남")};

        //로컬 변수 생략x
        Stream<Member> memberStream = Arrays.stream(members);
        Stream<Member> maleStream = memberStream.filter(m->m.getSex().equals("남"));
        IntStream maleAgeStream = maleStream.mapToInt(Member::getAge);
        double ageAvg = maleAgeStream.average().getAsDouble();
        System.out.println("나이:"+ageAvg);

        //로컬 변수 생략o
        double ageAvg2 = Arrays.stream(members)
                .filter(m->m.getSex().equals("남"))
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("나이:"+ageAvg2);
    }
    static class Member{
        private int age;
        private String sex;

        public Member(int age, String sex) {
            this.age = age;
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }
    }
}
