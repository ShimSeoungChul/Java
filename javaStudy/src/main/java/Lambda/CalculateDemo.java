package Lambda;

public class CalculateDemo {
    public static void main(String[] args){
        int x=1;
        int y=2;
        Calculate calculate = new Calculate() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(calculate.operation(x,y));
    }
}
