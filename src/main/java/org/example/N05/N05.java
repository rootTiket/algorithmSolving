package org.example.N05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class N05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = 0;
        char[] inputarr = input.toCharArray();
        for (char c : inputarr) {
            if (Character.isAlphabetic(c)) {
                n++;
            }
        }
        Integer[] check = new Integer[n];
        Integer[] reverse = new Integer[n];
        int k = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(inputarr[i])) {
                check[k] = i;
                reverse[k] = i;
                k++;
            }
        }
        Arrays.sort(reverse, Collections.reverseOrder());
        for (int i = 0; i < n/2; i++) {
            char temp;
            temp = inputarr[check[i]];
            inputarr[check[i]] = inputarr[reverse[i]];
            inputarr[reverse[i]] = temp;
        }
        System.out.println(inputarr);
    }
}
