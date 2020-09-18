# 3. java.time패키지

- 정의:  기존에 날짜, 시간을 다루기 위해 사용한 Date와 Calendar의 단점을 해소하기 위해 자바8에 추가된 패키지

|패키지|설명|
|---|------|
|java.time|날짜와 시간을 다루는데 필요한 핵심 클래스들을 제공|
|java.time.chrono|표준(ISO)이 아닌 달력 시스템을 위한 클래스들을 제공|
|java.time.format|날짜와 시간을 파싱하고, 형식화하기 위한 클래스들을 제공|
|java.time.temporal|날짜와 시간의 필드(field)와 단위(unit)을 위한 클래스들을 제공|
|java.time.zone|시간대(time-zone)와 관련된 클래스들을 제공|


- 위 패키지들에 속한 클래스의 가장 큰 특징은 String클래스처럼 `불변(immutable)`이라는 것
    - 날짜나 시간을 변경하는 메서드들은 기존의 객체를 변경하는 대신 항상 `변경된 새로운 객체`를 반환한다
    - 때문에 쓰레드 안전(thread-safe)하다 (멀티 쓰레드 환경에서 동시에 여러 쓰레드가 같은 객체에 접근해도 데이터가 잘못되지 않음)

## 3.1 java.time패키지의 핵심 클래스

- 시간을 표현할 때는 `LocalTime 클래스`, <br />
날짜를 표현할 때는 `LocalDate 클래스`,<br />
날짜와 시간이 모두 필요할 때는 `LocaDateTime 클래스`, <br />
날짜와 시간, 시간대(time-zone)를 다룬다면 `ZonedDateTime 클래스`를 사용하자. <br />
Calendar는 ZonedDateTime 처럼 날짜, 시간, 시간대 모두 갖는다.

- `Instant`는 Date와 유사한 클래스이며, 날짜와 시간은 초 단위(나노초)로 표현한다

- 날짜와 시간을 초단위로 표현한 값을 `타임스탬프`라고 하며, 날짜와 시간을 하나의 정수로 표현할 수 있어서 <br />
날짜와 시간의 `차이`를 계산하거나 `순서를 비교`하는데 유리해서 `데이터베이스`에 많이 사용한다


- `Year`, `YearMonth`, `MonthDay` 클래스로 날짜를 더 세부적으로 다룰 수 있다

### Period와 Duration
- Period는 두 날짜간의 차이를 표현한다
- Duration은 시간의 차이를 표현한다


### 객체 생성하기 - now(), of()
- now()는 현재 날짜와 시간을 저장하는 객체를 생성한다
```java
LocalDate date = LocalDate.now();
LocalTime time = LocalTime.now();
LocalDateTime dateTime = LocalDateTime.now();
ZonedDateTime zonedDateTime = ZonedDateTime.now();
```

- of()는 해당 필드의 값을 순서대로 지정하여 객체를 생성한다. 각 클래스마다 다양한 종류의 of()가 정의되어 있다.
```java
LocalDate date = LocalDate.of(2015,12,31);
LocalTime time = LocalTime.of(12,34,56);
    
LocalDateTime dateTime = LocalDateTime.of(date,time);
ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Seoul"));
```


### Temporal과 TemporalAmount

### TemporalUnit과 TemporalField

## 3.4 LocalDateTime과 ZonedDateTime
- LocalDate와 LocalTime을 합쳐 놓은 것이 LocalDateTime, <br />
LocalDateTime에 시간대(time zone)을 추가한 것이 ZonedDateTime이다.

## LocalDateTime만들기
- LocalDate와 LocalTime으로 만들기
```java
LocalDate date = LocalDate.of(2015,12,31);
LocalTime time = LocalTime.of(12,34,56);

LocalDateTime dt = LocalDateTime.of(date,time);
LocalDateTime dt2 = date.atTime(time);
LocalDateTime dt3 = time.atDate(date);
LocalDateTime dt4 = date.atTime(12,34,56);
LocalDateTime dt5 = time.atDate(LocalDate.of(2015,12,31));
LocalDateTime dt6 = date.atStartOfDay(); // dt6 = date.atTime(0,0,0);
```

- of(), now() 메서드로 만들기
```java
LocalDateTime dateTime = LocalDateTime.of(2015,12,31,12,34,56);
LocalDateTime today = LocalDateTime.now();
```
