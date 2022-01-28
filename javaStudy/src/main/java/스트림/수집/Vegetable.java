package 스트림.수집;

public class Vegetable{
    public enum Color {GREEN, RED,PURPLE}

    private String name;
    private double kg;
    private Color color;

    Vegetable(String name, double kg, Color color){
        this.name = name;
        this.kg = kg;
        this.color = color;
    }
    String getName(){
        return name;
    }
    Color getColor(){
        return color;
    }
    double getKg() { return kg; }
}
