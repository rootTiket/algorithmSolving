package org.example.N12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String count = sc.next();
        String input = sc.next();

        List<String> subStringList = new ArrayList<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i += 7) {
            subStringList.add(input.substring(i, i + 7));
        }

        for (String s : subStringList) {
            result.append(calc(s));
        }

        System.out.println(result);
    }

    public static char calc(String value) {
        List<String> valueList = new ArrayList<>(Arrays.asList(value.split("")));
        int total = 0;
        for (int i = 0; i < valueList.size(); i++) {
            //순회하면서 # = 1, * = 0 으로 계산
            if (valueList.get(i).equals("#")) {
                total += (int) Math.pow(2, 6-i);
            }
        }
        return (char)total;
    }
}
