package 제어문;

public class SwitchDemo {
    public static void main(String[] args){
        String mode = "a";
        int result = switch (mode) {
            case "a", "b" -> 1;
            case "c" -> 2;
            case "d", "e", "f"-> {
                System.out.println();
                    yield 3;
            }
            default -> -1;
        };
    }
}
