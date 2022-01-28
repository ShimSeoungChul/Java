package 컬렉션;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
    Properties prop = System.getProperties();
    Set<Object> keySet = prop.keySet();
    for (Object obj:keySet)
        System.out.println(obj+"="+prop.get(obj));
    }
}
