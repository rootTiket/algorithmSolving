package org.example.N07;

import java.util.Scanner;

public class N07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean flag = false;
        char[] inputarr = input.toLowerCase().toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if (inputarr[i] == inputarr[input.length() - i - 1]) {
                flag = true;
            } else {
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
