package org.example.N15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tryCount = Integer.parseInt(sc.next());
        List<Integer> aResult = new ArrayList<>();
        List<Integer> bResult = new ArrayList<>();

        init(sc, aResult, bResult, tryCount);

        for (int i = 0; i < tryCount; i++) {
            startGame(aResult.get(i), bResult.get(i));
        }

    }

    public static void init(Scanner sc, List<Integer> aResult, List<Integer> bResult, int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            aResult.add(Integer.parseInt(sc.next()));
        }

        for (int i = 0; i < tryCount; i++) {
            bResult.add(Integer.parseInt(sc.next()));
        }
    }

    public static void startGame(int a, int b) {
        switch (a) {
            case 1:
                if (b == 1) {
                    System.out.println('D');
                    break;
                }
                if (b == 2) {
                    System.out.println('B');
                    break;
                }
                if (b == 3) {
                    System.out.println('A');
                    break;
                }
            case 2:
                if (b == 1) {
                    System.out.println('A');
                    break;
                }
                if (b == 2) {
                    System.out.println('D');
                    break;
                }
                if (b == 3) {
                    System.out.println('B');
                    break;
                }
            case 3:
                if (b == 1) {
                    System.out.println('B');
                    break;
                }
                if (b == 2) {
                    System.out.println('A');
                    break;
                }
                if (b == 3) {
                    System.out.println('D');
                    break;
                }
        }
    }
}
