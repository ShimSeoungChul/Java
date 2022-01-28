package 객체지향.디자인패턴.StrategyPattrn;

public class Soldier {
    public void runContext(Strategy strategy){
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }
}
