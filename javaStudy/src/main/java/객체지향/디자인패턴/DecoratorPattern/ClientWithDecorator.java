package 객체지향.디자인패턴.DecoratorPattern;

public class ClientWithDecorator {
    public static void main(String[] args){
        IService decorator = new Decorator();
        System.out.println(decorator.runSomething());
    }
}
