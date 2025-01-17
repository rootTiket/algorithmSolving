package org.example.N17;

import java.util.Scanner;

public class MainSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int cnt = Integer.parseInt(sc.next());
        int[] numbers = new int[cnt];

        int primeCnt = 0;

        for (int i = 2; i < cnt; i++) {
            if (numbers[i] == 0) {
                primeCnt++;
                for (int j = i; j < cnt; j += i) {
                    numbers[j] = 1;
                }
            }
        }


        System.out.println(primeCnt);
    }
}
