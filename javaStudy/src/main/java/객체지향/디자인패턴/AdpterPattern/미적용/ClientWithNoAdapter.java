package 객체지향.디자인패턴.AdpterPattern.미적용;

public class ClientWithNoAdapter {
    public static void main(String[] args){
        ServiceA sa1 = new ServiceA();
        ServiceB sb1 = new ServiceB();

        sa1.runServiceA();
        sb1.runServiceB();
    }
}
