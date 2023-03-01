package org.example.ll230228.CU3004_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<NumData> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            NumData nDatum = new NumData(0, num);
            nums.add(nDatum);
        }


        List<NumData> sortedNums = nums.stream().sorted(Comparator.comparingInt(NumData::getData)).collect(Collectors.toList());
        for (int i = 0; i < n; i++) {
            sortedNums.get(i).setId(i);
        }
        String output = nums.stream().map(e -> e.getId() + "").collect(Collectors.joining(" "));


        System.out.println(output);
    }
}

class NumData {
    int id;
    int data;

    NumData(int id, int data) {
        this.id = id;
        this.data = data;
    }
    public int getId() {
        return id;
    }

    public int getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }
}