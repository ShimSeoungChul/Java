package 레코드;

public record Person(String name, int age) {
    public Person{
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

}