package org.example.ll230228.L63_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        new Sol2().run();

    }
}

class Sol1 {

    void run() {
        Map<String, Object> person1 = new HashMap<>();
        person1.put("이름", "홍길동");
        person1.put("나이", 22);
        person1.put("키", 170.5);
        Map<String, Object> person2 = new HashMap<>();
        person1.put("이름", "홍길순");
        person1.put("나이", 25);
        person1.put("키", 162.4);

        System.out.println(person1.get("이름"));
    }
}

class Sol2 {
    void run() {
        Map<String, Object> person1 = new HashMap<>(){{
            put("이름", "홍길동");
            put("나이", 22);
            put("키", 170.5);
        }};
        Map<String, Object> person2 = new HashMap<>(){{
            put("이름", "홍길순");
            put("나이", 25);
            put("키", 162.4);
        }};

        String p1Name = (String) person1.get("이름");
        int p1Age = (int) person1.get("나이");
        double p1Height = (double) person1.get("키");

        String p2Name = (String) person2.get("이름");
        int p2Age = (int) person2.get("나이");
        double p2Height = (double) person2.get("키");


        System.out.printf("%s, %d, %.1f\n", p1Name, p1Age, p1Height);
        System.out.printf("%s, %d, %.1f\n", p2Name, p2Age, p2Height);

    }
}
