package 스트림.수집;

import java.util.ArrayList;
import java.util.List;

public class GreenVegetable {
    private List<Vegetable> list; //요소를 저장할 컬렉션

    public GreenVegetable(){
        list = new ArrayList<Vegetable>();
        System.out.println("[" + Thread.currentThread().getName() + "] GreenVegetable()");
    }
    // 매개값으로 받은 Vegetable을 list 필드에 수집
    public void accumulate(Vegetable vegetable){ //요소를 수집하는 메소드
        list.add(vegetable);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }
    // 병렬 처리 스트림을 사용할 때 다른 GreenVegetable과 결합할 목적으로 실행
    public void combine(GreenVegetable other){
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }
    public List<Vegetable> getList(){ //요소가 저장된 컬렉션 리턴
        return list;
    }
}
