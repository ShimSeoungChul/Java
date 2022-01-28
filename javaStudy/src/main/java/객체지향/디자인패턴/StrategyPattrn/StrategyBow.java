package 객체지향.디자인패턴.StrategyPattrn;

public class StrategyBow implements Strategy{
    @Override
    public void runStrategy(){
        System.out.println("슝.. 쐐액.. 쉑, 최종 병기");
    }
}