package Flab질문.Enum과Singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    public static Singleton INSTANCE = new Singleton();
    private int value;

    private Singleton(){};

    protected Object readResolve() {
        return INSTANCE;
    }

    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
