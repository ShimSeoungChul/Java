package 객체지향.디자인패턴.ProxyPattern.적용;

public class ClientWithProxy {
    public static void main(String[] args){
        //프록시를 이용한 호출
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}
