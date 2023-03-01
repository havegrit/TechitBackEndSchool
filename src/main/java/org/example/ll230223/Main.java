package org.example.ll230223;


// 문제 : 아래와 같이 출력 되도록 해주세요.
// 조건 : 생성자를 오직 3개만 사용해서 만들어주세요.

class Main {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}

class 사람 {
    왼팔 a왼팔;
    사람() {
        a왼팔 = new 왼팔();
        a왼팔.a손 = new 손();
        a왼팔.a손.a엄지손가락 = new 엄지손가락();
        a왼팔.a손.a엄지손가락.길이 = 5;
    }

}

class 왼팔 {
    손 a손;
}

class 손 {
    엄지손가락 a엄지손가락;
}

class 엄지손가락 {
    int 길이;
}
