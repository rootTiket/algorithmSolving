package org.example.N08;

import java.util.Scanner;

public class N08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean flag = true;
        String[] inputarr = input.toLowerCase().split(" ");
        int k = 0;
        for (String s : inputarr) {
            for (char c : s.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    k++;
                }
            }
        }
        char[] newCharArr = new char[k];
        k = 0;
        for (String s : inputarr) {
            for (char c : s.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    newCharArr[k] = c;
                    k++;
                }
            }
        }
        for (int i = 0; i < newCharArr.length; i++) {
            if (newCharArr[i] != newCharArr[newCharArr.length - i - 1] && Character.isAlphabetic(newCharArr[i]) && Character.isAlphabetic(newCharArr[newCharArr.length - i - 1])) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
