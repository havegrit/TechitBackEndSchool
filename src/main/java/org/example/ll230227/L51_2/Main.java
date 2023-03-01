package org.example.ll230227.L51_2;
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
// 문제 - 자동차를 달리게 해주세요(static 사용 금지)(개념 - static)

class Main {
    public static void main(String[] args) {
        new 자동차().달리다();
    }
}
class 자동차 {
    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}

