package org.example.N02;

import java.util.Scanner;

public class N02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ar = new char[str.length()];
        int cnt = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ar[cnt]= Character.toLowerCase(c);
            } else {
                ar[cnt]= Character.toUpperCase(c);
            }
            cnt ++;
        }
        System.out.println(ar);
    }
}
