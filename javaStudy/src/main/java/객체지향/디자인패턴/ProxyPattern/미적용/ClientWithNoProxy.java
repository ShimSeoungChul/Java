package 객체지향.디자인패턴.ProxyPattern.미적용;

public class ClientWithNoProxy {
    public static void main(String[] args){
        // 프록시를 이용하지 않은 호출
        Service service = new Service();
        System.out.println(service.runSomething());
    }
}
