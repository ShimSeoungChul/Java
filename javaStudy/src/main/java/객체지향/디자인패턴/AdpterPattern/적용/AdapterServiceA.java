package 객체지향.디자인패턴.AdpterPattern.적용;

import 객체지향.디자인패턴.AdpterPattern.미적용.ServiceA;

public class AdapterServiceA {
    ServiceA sa1 = new ServiceA();

    void runService() {
        sa1.runServiceA();
    }
}