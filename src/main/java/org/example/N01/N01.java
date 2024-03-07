package org.example.N01;

import java.util.Scanner;

public class N01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        char[] letter = sc.next().toLowerCase().toCharArray();
        int cnt = 0;
        for (char c : inputString.toLowerCase().toCharArray()) {
            if (letter[0] == c) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}