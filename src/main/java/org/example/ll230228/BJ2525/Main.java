package org.example.ll230228.BJ2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cookingTime = sc.nextInt();
        int presentTimeToMin = hour*60 + min;
        int completeTime = presentTimeToMin + cookingTime;
        if(completeTime > 1439) {
            completeTime -= 1440;
        }
        hour = completeTime/60;
        min = completeTime%60;
        System.out.printf("%d %d", hour, min);
    }
}
