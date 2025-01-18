package org.example.N18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.next());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            StringBuffer sb = new StringBuffer(sc.next());
            int reverse = Integer.parseInt(sb.reverse().toString());
            numbers.add(reverse);
        }

        numbers.forEach(Main::checkPrime);

    }

    public static void checkPrime(int number) {
        int[] arr = new int[number+1];
        for (int i = 2; i < number; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < number+1; j += i) {
                    arr[j] = 1;
                }
            }
        }

        if (arr[number] == 0 && number != 1) {
            System.out.print(number + " ");
        }
    }
}
