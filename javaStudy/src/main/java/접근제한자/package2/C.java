package 접근제한자.package2;

import 접근제한자.package1.A;

public class C {

    public C() {
        A a = new A();
//        a.field1 = 1; // 접근가능 o
//        a.field2 = 1; // 접근불가 x - default 필드 접근 불가 (컴파일 에러)
//        a.field3 = 1; // 접근불가 x - private 필드 접근 불가 (컴파일 에러)
//
//        a.method1();// 접근가능 o
//        a.method2();// 접근불가 x - default 필드 접근 불가 (컴파일 에러)
//        a.method3();// 접근불가 x - private 필드 접근 불가 (컴파일 에러)
//    }
    }
}