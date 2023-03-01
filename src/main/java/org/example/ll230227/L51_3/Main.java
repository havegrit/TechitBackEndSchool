package org.example.ll230227.L51_3;
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.

// ps. 파이는 3.141592 라고 가정하겠습니다.

class Main {
    public static void main(String[] args) {
        System.out.println(new 수학().PI);
        // 출력 : 3.141592
    }
}
class 수학 {
    double PI = 3.141592;
}