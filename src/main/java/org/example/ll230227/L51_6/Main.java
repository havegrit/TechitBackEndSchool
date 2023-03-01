package org.example.ll230227.L51_6;
//code.oa.gg/java8/956
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.

class Main {
    public static void main(String[] args) {
        출력("안녕");
        // 출력 : 안녕

        출력(5);
        // 출력 : 5
    }
    static void 출력(String str) {
        System.out.println(str);
    }

    static void 출력(int a) {
        System.out.println(a);
    }

}

