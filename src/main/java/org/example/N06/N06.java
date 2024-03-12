package org.example.N06;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class N06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        LinkedHashSet<Character> words = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            words.add(c);
        }
        char[] newWord = new char[words.size()];
        int n = 0;
        for (Character c : words) {
            newWord[n] = c;
            n++;
        }
        System.out.println(newWord);
    }
}
