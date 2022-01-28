package 상속;

public class ComputerExam {
    public static void main(String args[]){
        Computer computer = new Computer();
        Mac mac = new Mac();

        System.out.println(computer instanceof Computer);
        System.out.println(computer instanceof Mac);
        System.out.println(mac instanceof Computer);
        System.out.println(mac instanceof Mac);
    }
}
