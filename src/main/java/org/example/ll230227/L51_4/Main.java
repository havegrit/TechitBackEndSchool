package org.example.ll230227.L51_4;
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.

class Main {
    public static void main(String[] args) {
        // 오직 객체만으로 해결하면 번거롭다.
        System.out.println(수학.PI);

        System.out.println(수학.더하기(10, 20));
        // 출력 : 30
    }
}

class 수학 {
    // static 을 붙이면 해당 변수는 설계도에만 존재하게 됩니다.
    static double PI = 3.141592;

    static int 더하기(int a, int b) {
        return a + b;
    }
}