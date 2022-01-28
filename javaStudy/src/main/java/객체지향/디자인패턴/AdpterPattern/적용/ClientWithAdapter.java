package 객체지향.디자인패턴.AdpterPattern.적용;

import 객체지향.디자인패턴.AdpterPattern.미적용.ServiceA;
import 객체지향.디자인패턴.AdpterPattern.미적용.ServiceB;

public class ClientWithAdapter {
    public static void main(String[] args){
        AdapterServiceA sa1 = new AdapterServiceA();
        AdapterServiceB sb1 = new AdapterServiceB();

        sa1.runService();
        sb1.runService();
    }
}
