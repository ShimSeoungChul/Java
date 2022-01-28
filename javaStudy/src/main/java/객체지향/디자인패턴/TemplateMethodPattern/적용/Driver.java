package 객체지향.디자인패턴.TemplateMethodPattern.적용;

public class Driver {
    public static void main(String[] args){
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        bolt.playWithOwner();

        System.out.println();
        System.out.println();

        kitty.playWithOwner();
    }
}
