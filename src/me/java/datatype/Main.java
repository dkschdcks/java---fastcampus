package me.java.datatype;

public class Main {
    public static void main(String[] args) {
//        리터럴(literal) : 데이터 수
//        자료형 (datatype) >> 스택과 힙은 같은 공간에 있지만 개념으로 구분되어 있음

//        1. 원시형 (primitive type) : 스택 공간 / 비트수가 정해짐
//        int(4byte == 32bit), -2^31 ~ 2^31-1
//        float(4byte == 32bit),
//        double(8byte == 64bit),
//        char(2byte == 16bit),
//        1byte = 8bit

//        2. 참조형 (reference type) : 힙 공간 / 비트수가 안 정해짐
//        String << 누군가 만들어둔 클래스
        System.out.println("실행됨??");
        // 작은 발은 큰신발에 들어갈 수 있음
        // 작은 리터럴은 큰 변수공간에는 들어갈 수 있음

        byte b = 10; // 1 byte = 4 byte 바이트로 줄여서 입력될 수 있으면 줄이는 케스팅을 진행함
        short s = (short) 1000000; // 타입 케스팅을 진행할 수 있음 데이터 손실로 값은 틀릴 수 있음(명시적 형변환)
        int i = 10; // 정수의 기본단위
        long l = 10;  // 작은걸 큰곳에 들어가는건 promotion한다고 표현(자동 형변환)
        float f = 3.14f;
        double d = 3.14; // 실수의 기본단위
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(byte.MAX_VALUE);

        // System.out.println("var2" + var2); 원래는 산술연산이 안됨
        // 문자열 + 문자열 = 문자열의 결합
        // 문자열 + 정수 = 문자열의 결합????? (promotion) 정답 : 정수를 문자열로 프로모션 진행함
        // "a" + "a" = "aa"

    }
}
