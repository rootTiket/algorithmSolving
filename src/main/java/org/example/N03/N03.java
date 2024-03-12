package org.example.N03;

import java.util.Arrays;
import java.util.Scanner;

public class N03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] sr = input.split(" ");
        int max = 0;
        String word = "";
        for (String s : sr) {
            if (max < s.length()) {
                max = s.length();
                word = s;
            }
        }
        System.out.println(word);
    }
}
