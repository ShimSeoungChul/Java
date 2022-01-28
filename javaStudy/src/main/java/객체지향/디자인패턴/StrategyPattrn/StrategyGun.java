package 객체지향.디자인패턴.StrategyPattrn;

public class StrategyGun implements Strategy{
    @Override
    public void runStrategy(){
        System.out.println("탕, 타당, 타다당");
    }
}
