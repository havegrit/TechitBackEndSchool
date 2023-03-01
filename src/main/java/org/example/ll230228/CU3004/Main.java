package org.example.ll230228.CU3004;

import java.util.*;
import java.util.stream.Collectors;

// class 구현없이 해결한 버전
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }
        List<Integer> sortedNums = nums
                .stream()
                .sorted()
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if(!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(sortedNums.indexOf(nums.get(i)));
        }
        System.out.println(sb);
    }
}