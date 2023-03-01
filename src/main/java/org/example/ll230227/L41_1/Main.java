package org.example.ll230227.L41_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(isHangul('안'));
        System.out.println(isHangul('녕'));
        System.out.println(isHangul('하'));
        System.out.println(isHangul('세'));
        System.out.println(isHangul('요'));
        System.out.println(isHangul('.'));

    }

    //매개변수로 주어진 문자가 한글인지 파악하는 메소드
    static boolean isHangul(char c) {
        return c >= '가' && c <= '힣';
    }
}

