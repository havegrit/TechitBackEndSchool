package org.example.ll230227.L41_2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(13);
        Person p2 = new Person(13);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("p1 == p2: " + (p1 == p2));

        String s1 = "하하";
        String s2 = "하하"; //자바에서는 문자열의 경우 한 번 생성된 객체를 재활용한다.
        // new String("하하"); 이런식으로 객체를 생성하면 재활용(혹은 공유) 하지 않음. 하지만 실무에서 String을 이렇게 초기화하는 경우는 거의 없다.

        System.out.println(s1 == s2);
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}
