package 객체지향.자바가확장한객체지향;

public class Driver {
    public static void main(String[] args){
        동물[] 동물들 = new 동물[3];
        동물들[0] = new 쥐("쥐");
        동물들[1] = new 고양이("고양이");
        동물들[2] = new 병아리("병아리");

        for(int i=0; i<동물들.length; i++)
            동물들[i].울어보세요();
    }
}
