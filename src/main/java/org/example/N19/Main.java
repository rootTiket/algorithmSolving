package org.example.N19;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int problemCount = Integer.parseInt(sc.next());
        int bonus = 0;
        int result = 0;
        for (int i = 0; i < problemCount; i++) {
            int answer = Integer.parseInt(sc.next());
            if (answer == 0) {
                bonus = 0;
            } else {
                bonus++;
                result += bonus;
            }
        }
        System.out.println(result);
    }
}
