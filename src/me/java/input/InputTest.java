package me.java.input;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
//        입력 메소드
//        사용자가 콘솔을 통해 입력한 데이터를 저장
        Scanner scanner = new Scanner(System.in);
//                객체 (object) : 실체 행동하는 단위
        System.out.print("정수를 입력해주세요 : ");
        int num = scanner.nextInt( );
        System.out.println(num);

    }
}
