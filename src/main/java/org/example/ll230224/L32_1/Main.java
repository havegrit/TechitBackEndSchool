package org.example.ll230224.L32_1;
// 문제 : 아래 코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        병사 a병사 = new 병사();
        a병사.이름 = "홍길동";

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 이병 입니다.
        a병사.공격();
        // 홍길동 이병이 공격합니다.(공격력 : 7)

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 일병 입니다.
        a병사.공격();
        // 홍길동 일병이 공격합니다.(공격력 : 9)

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 상병 입니다.
        a병사.공격();
        // 홍길동 상병이 공격합니다.(공격력 : 11)
    }
}

class 병사 {
    String 이름;
    String 계급;

    int 공격력;

    병사() {
        계급 = "이병";
        공격력 = 7;
    }

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + 이름 + " " +  계급 +" 입니다.");
    }

    void 진급() {
        switch (계급) {
            case "이병" -> 계급 = "일병";
            case "일병" -> 계급 = "상병";
            case "상병" -> 계급 = "병장";
        }
        공격력+=2;
    }

    void 공격() {
        System.out.printf("%s %s이 공격합니다. (공격력 : %d )\n", 이름, 계급, 공격력);
    }
}