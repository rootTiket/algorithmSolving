package org.example.N16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tryCount = Integer.parseInt(sc.next());

        int[] numbers = new int[tryCount];
        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 2; i < tryCount; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        for (int i : numbers) {
            sb.append(Integer.toString(i)).append(" ");
        }
        System.out.println(sb.toString());
    }
}
