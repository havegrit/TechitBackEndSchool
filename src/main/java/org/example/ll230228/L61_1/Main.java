package org.example.ll230228.L61_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Sol4.run();
        Sol5.run();
    }

    class Sol4 {

        public static void run() {
            Scanner sc = new Scanner(System.in);
            List<Integer> numbers = new ArrayList<>();

            while (true) {
                System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
                int num = sc.nextInt();

                if (num == -1) {
                    System.out.println("입력을 종료합니다.");
                    break;
                }
                numbers.add(num);
            }

            numbers.sort(null);

            StringBuilder sb = new StringBuilder();

            for(int num:numbers) {
                if(!sb.isEmpty()) {
                    sb.append(", ");
                }
                sb.append(num);
            }

            System.out.printf("입력한 숫자(오름차순) : %s\n", sb);
            System.out.println("프로그램을 종료합니다.");

            sc.close();
        }
    }

    //stream 활용
    class Sol5 {
        public static void run() {
            Scanner sc = new Scanner(System.in);
            List<Integer> numbers = new ArrayList<>();

            while (true) {
                System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
                int num = sc.nextInt();

                if (num == -1) {
                    System.out.println("입력을 종료합니다.");
                    break;
                }
                numbers.add(num);
            }

            String str =
            numbers
                    .stream()
                    .sorted()
                    .map(e -> "" + e)
                    .collect(Collectors.joining(", "));

            System.out.printf("입력한 숫자(오름차순) : %s\n", str);
            System.out.println("프로그램을 종료합니다.");

            sc.close();
        }
    }
}
