package 레코드;

public class RecordDemo {
    public static void main(String[] args){
        Person person = new Person("Ted", 100);
        System.out.println("이름:"+ person.name() + " 나이:"+person.age());
        System.out.println("객체 정보:"+person.toString());
        Person person2 = new Person("Ted", 100);
        Person person3 = new Person("Dean", 200);

        if (person.equals(person2)) System.out.println("person, person2는 같은 사람");
        else System.out.println("person, person2는 다른 사람");

        if (person.equals(person3)) System.out.println("person, person3는 같은 사람");
        else System.out.println("person, person3는 다른 사람");

    }
}
