# 1.4 Comparator와 Comparable
- Comparator와 Comparable은 모두 `인터페이스`로 `컬렉션을 정렬하는데 필요한 메서드를 정의`한다

- Comparator와 Comparable의 실제 소스
```java 
public interface Comparator{
    int compare(Object o1, Object o2);
    boolean equals(Object obj);
}

public interface Comparable{
    public int compareTo(Object o);
}
```

- compare(), compareTo()는 선언형태와 이름이 약간 다를 뿐 두 객체를 비교한다는 같은 기능을 목적으로 고안됨
- compare(), comparaTo()는 객체를 비교해서 음수, 0, 양수 중의 하나를 반환하도록 구현해야함
- Comparable은 java.lang패키지, Comparator는 java.util패키지에 있다
- equals() 메서드는 Comparator를 구현하는 클래스는 오버라이딩이 필요할 수도 있다는 것을 알리기 위해 정의한 것일 뿐, <br />
그냥 compare(Object o1, Object o2)만 구현하면 된다.


```java
//Comparable을 구현한 Integer 클래스 예제
public final class Integer extends Number implements Comparable<Integer> {

public int compareTo(Integer anotherInteger) {
    return compare(this.value, anotherInteger.value);
}

public static int compare(int x, int y) {
    return (x < y) ? -1 : ((x == y) ? 0 : 1);
}

}
```


- `Comparable`을 구현한 클래스는 기본적으로 `오름차순`으로 정렬되어 있지만,  <br />
`내림차순` 또는 `다른 기준`으로 정렬하고 싶다면 `Comparator`를 구현해서 정렬기준을 제공할 수 있다.

```java
public class ComparatorAndComparableExam {
    public static void main(String[] args){
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr); // String의 Comparable 구현에 의한 정렬
        System.out.println("Strarr="+ Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
        System.out.println("Strarr="+ Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("Strarr="+ Arrays.toString(strArr));
    }
    static class Descending implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            if(o1 instanceof  Comparable && o2 instanceof Comparable){
                Comparable c1 = (Comparable)o1;
                Comparable c2 = (Comparable)o2;
                return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경한다.
                // 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
            }
            return -1;
        }
    }
}
```

- 위 코드에서처럼 Arrays.sort()는 배열을 정렬할 때, Comparator를 지정하지 않으면 저장하는 객체에 구현된 내용에 따라 정렬된다<br />
static void sort(Object[] a) // 객체 배열에 저장된 객체가 구현한 Comparable에 의한 정렬<br />
static void sort(Object[] a, Comparator c) //지정한 Comparator에 의한 정렬 <br />

- 문자열의 오름차순 정렬은 문자의 유니코드의 순서가 작은 값부터 큰 값으로 정렬된다 ( 공백, 숫자, 대문자, 소문자 순)
- 문자열에는 아래와 같이 대소문자를 구분하지 않고 비교하는 Comparator를 상수 형태로 제공한다 <br />
public static final Comparator<String> CASE_INSENSITIVE_ORDER
- 문자열을 내림차순으로 구현하려면 단지 String에 구현된 compareTo() 결과에 -1을 곱하면 된다. <br />
또는 비교하는 객체의 위치를 바꿔서 c2.comprareTo(c1)과 같이 해도 된다.


