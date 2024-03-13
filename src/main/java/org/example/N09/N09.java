package org.example.N09;

import java.util.Scanner;

public class N09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s = "";
        for (char c : input.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                s = s + c;
            }
        }
        Integer result = Integer.parseInt(s);
        System.out.println(result);
    }
}
