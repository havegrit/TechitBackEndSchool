package org.example.ll230227.L51_5;
//code.oa.gg/java8/948
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
// 각각의 사람이 올바른 자기소개를 하도록 해주세요.(개념 - static)

class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람();
        a사람1.이름 = "홍길동";
        a사람1.나이 = 22;

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.

        사람 a사람2 = new 사람();
        a사람2.이름 = "홍길순";
        a사람2.나이 = 25;

        a사람2.자기소개();
        // 출력 : 저는 25살 홍길순 입니다.

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.
    }
}

class 사람 {
    int 나이;
    String 이름;

    void 자기소개() {
        System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }
}