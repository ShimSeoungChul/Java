# 1.4 Stack과 Queue

## Stack
- 스택은 마지막에 저장한 데이터를 가장 먼저 꺼내게 되는 LIFO(Last In First Out)구조
- 예를 들어 0, 1, 2 순서로 데이터를 넣었다면 꺼낼 때는 2, 1, 0 순서로 꺼냄

## Queue
- 큐는 처음에 저장한 데이터를 가장 먼저 꺼내게 되는 FIFO(First In First Out)구조
- 예를 들어 0, 1, 3 순서로 데이터를 넣었다면 꺼낼 때도 0, 1, 2 순서로 꺼냄

## Stack과 Queue의 구현
- 순차적으로 데이터를 추가하고 삭제하는 스택에는 ArrayList 같은 배열기반 컬렉션 클래스가 적합하다
- 큐는 데이터를 꺼낼 때 항상 첫 번째 저장된 데이터를 삭제하므로, <br />
배열기반 컬렉션 클래스를 사용하면 데이터를 꺼낼 때마다 빈 공간을 채우기 위해 데이터의 복사가 발생하므로 비효율적이다. <br />
그래서 큐는 ArrayList보다 데이터를 추가/삭제가 쉬운 LinkedList로 구현하는 것이 더 적합하다

### Stack 메서드
|메서드|설명|
|-|-|
|boolean empty()| Stack이 비어있는지 알려준다.|
|Object peek()| Stack의 맨 위에 저장된 객체를 반환. pop()과 달리 Stack에서 객체를 꺼내지는 않음.(비어있을 때는 EmptyStackException발생) |
|Obejct pop())| Stack의 맨 위에 저장된 객체를 꺼낸다. (비었을 때는 EmptyStackException발생) |
|Object push(Object Item) | Stack에 객체(Item)를 저장 |
|int search(Object o) | Stack에서 주어진 객체(o)를 찾아서, 그 위치를 반환. 못찾으면 -1을 반환. (배열과 달리 위치는 0이 아닌 1부터 시작) |

### Queue 메서드
|메서드|설명|
|-|-|
|boolean add(Object o)| 지정된 객체를 Queue에 추가. 성공하면 true 반환. 저장곤간이 부족하면 IllegalStateException발생 |
|Object remove() | Queue에서 객체를 꺼내 반환. 비어있으면 NoSuchElementException발생 |
|Object element()| 삭제없이 요소를 읽어온다. peek과 달리 Queue가 비었을 때 NoSuchElementException발생 |
|boolean offer(Object o) | Queue에 객체를 저장. 성공하면 true, 실패하면 false를 반환 |
|Object poll() | Queue에서 객체를 꺼내서 반환, 비어있으면 null을 반환 |
|Object peek() | 삭제없이 요소를 읽어 온다. Queue가 비어있으면 nulld을 반환 |

# remove, element vs poll, peek 어떨 때 사용할까?

### 예제

### Stack 직접 구현

## PriorityQueue
-  Queue 인터페이스의 구현체 중의 하나로, 저장한 순서에 관계없이 우선순위(priority)가 높은 것부터 꺼낸다
- null을 저장하면 NullPointerException을 발생하므로, null 저장 불가
- 저장공간으로 배열을 사용하며, 각 요소를 '힙'이라는 자료구조 형태로 저장
    - 힙은 이진 트리의 한 종류로 가장 큰(또는 작은) 값을 빠르게 탐색 가능 <br />
    (자료구조 힙은 JVM 힙과 이름만 같고 다른 것)
    
```java
public class PriorityQueueExam {
    public static void main(String[] argv) {
        Queue<Integer> queue = new PriorityQueue();
        queue.offer(3);
        queue.offer(1);
        queue.offer(5);
        queue.offer(2);
        queue.offer(4);
        System.out.println(queue);

        Object obj = null;

        //PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
        while ((obj = queue.poll()) != null) {
            System.out.println(obj);
        }
    }
}
/*
결과
[1, 2, 5, 3, 4]
1
2
3
4
5
 */
```

- 저장순서가 3, 1 , 5, 2, 4이지만 출력 결과는 1, 2, 3, 4, 5 
    - 우선순위는 숫자가 작을수록 높은 것이므로
- 숫자뿐만 아니라 객체를 저장할 수도 있는데 그럴 경우 객체의 크기를 비교할 수 있는 방법을 제공하자
    -  `comparable` 또는 `comparator` 를 구현한다

## Deque(Double - Ended Queue, 덱 또는 디큐)
- Queue의 변형으로, 양쪽 끝에 추가/삭제가 가능
    - Queue는 한 쪽 끝으로만 추가/삭제 가능
- Deque의 조상은 Queue이며, 구현체로 ArrayDeque, LinkedList가 있다
- 덱은 `스택과 큐를 하나로 합쳐놓은 것`과 같으며 스택으로 사용할 수도, 큐로 사용할 수도 있다

|Deque|Queue|Stack|
|-|-|-|
|offerLast() | offer() | push() |
|pollLast() |-| pop() |
|pollFirst()| poll() | - |
| peekFirst() | peek() | - |
| peekLast() | - | peek() |

