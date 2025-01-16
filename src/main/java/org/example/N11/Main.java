package org.example.N11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        List<String> inputList = new ArrayList<>(Arrays.asList(input.split("")));
        int cnt = 0;
        String flag = inputList.get(0);
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < inputList.size(); i++) {
            String s = inputList.get(i);
            if (!flag.equals(s)) {
                addAnswer(flag, cnt, answer);
                flag = s;
                cnt = 1;
            } else {
                cnt++;
            }
        }

        addAnswer(flag, cnt, answer);

        System.out.println(answer);
    }

    public static void addAnswer(String s, int cnt, StringBuilder answer) {
        if (cnt == 1) {
            answer.append(s);
        } else {
            answer.append(s);
            answer.append(cnt);
        }
    }
}
