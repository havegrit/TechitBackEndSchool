package org.example.ll230227.L53_1;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while(true) {
            System.out.printf("숫자: ");
            try {
                n = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("숫자를 입력해주세요. ");
            }
        }
        System.out.printf("입력 숫자: %d", n);

        sc.close();
    }
}
