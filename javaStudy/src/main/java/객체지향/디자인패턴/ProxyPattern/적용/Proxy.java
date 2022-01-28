package 객체지향.디자인패턴.ProxyPattern.적용;

public class Proxy implements IService{
    IService service1;

    public String runSomething(){
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과는 그대로 전달");

        service1 = new Service();
        return service1.runSomething();
    }
}
