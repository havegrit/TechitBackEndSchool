package org.example.ll230227.L51_1;


//문제 - 문장에서 x가 얼마나 많이 들어 있는지 알려주세요.

class Main {
    public static void main(String[] args) {
        String str = "axslekjxxlkzjxkljxxXXXssjxxXXxxX";

        int xCount = 0;

        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == 'x') {
               xCount++;
           }
        }

        System.out.println("xCount : " + xCount);
    }
}