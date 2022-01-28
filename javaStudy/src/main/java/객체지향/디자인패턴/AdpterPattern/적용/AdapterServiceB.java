package 객체지향.디자인패턴.AdpterPattern.적용;

import 객체지향.디자인패턴.AdpterPattern.미적용.ServiceB;

public class AdapterServiceB {
    ServiceB sb1 = new ServiceB();

    void runService() {
        sb1.runServiceB();
    }
}