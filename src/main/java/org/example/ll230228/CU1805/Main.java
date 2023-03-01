package org.example.ll230228.CU1805;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<VME> equipments = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int gas = sc.nextInt();
            equipments.add(new VME(id, gas));
        }
        //v1
//        equipments = equipments
//                .stream()
//                .sorted(Comparator.comparing(VME::getId))
//                //.sorted((e2, e1) -> e2.getId - e1.getId)
//                .collect(Collectors.toList());
//
//        for (VME equipment:equipments) {
//            System.out.printf("%d %d\n",equipment.getId(), equipment.getGas());
//        }
        //v2
        String output = equipments
                .stream()
                .sorted(Comparator.comparing(VME::getId))
                .map(e -> "%d %d".formatted(e.getId(), e.getGas()))
                //.map(e -> e.getId() + " " + e.getGas()))
                .collect(Collectors.joining("\n"));

        System.out.println("output = " + output);
    }
}

class VME {
    private int id;
    private int gas;
    VME(int id, int gas) {
        this.id = id;
        this.gas = gas;
    }

    int getId() {
        return id;
    }
    int getGas() {
        return gas;
    }

    @Override
    public String toString() {
        return "VME{" +
                "id=" + id +
                ", gas=" + gas +
                '}';
    }
}