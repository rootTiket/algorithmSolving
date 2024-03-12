package org.example.N04;

import java.util.Scanner;

public class N04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        for (String s : words) {
            char[] c = s.toCharArray();
            char[] newc = new char[c.length];
            int cnt = c.length-1;
            for (char a : c) {
                newc[cnt] = a;
                cnt --;
            }
            System.out.println(newc);
        }
    }
}
