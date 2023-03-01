package org.example.ll230228.Mission_1;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[20];
        Arrays.fill(nums, -1);
        int cnt = 0;
        while(true){
            System.out.printf("숫자를 입력해주세요(종료: -1): ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            } else {
                nums[cnt++] = n;
            }
        }

        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();

        for(int num:nums) {
            if(num == -1) continue;
            if(!sb.isEmpty()) {
                sb.append(", ");
            }
            sb.append(num);
        }

        System.out.printf("입력한 숫자(오름차순): %s \n", sb.toString());
        System.out.println("프로그램을 종료합니다.");
    }
}
