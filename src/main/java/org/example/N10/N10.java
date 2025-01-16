package org.example.N10;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class N10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String target = sc.next();

        List<String> inputList = new ArrayList<>(Arrays.asList(input.split("")));

        List<Integer> answer = new ArrayList<>();

        List<Integer> targetIndexes = createTargetIndexes(inputList, target);

        for (int i = 0 ; i < inputList.size(); i++) {
            String s = inputList.get(i);
            if (isTarget(s, target)) {
                answer.add(0);
            } else {
                answer.add(calculateDistance(targetIndexes, i));
            }
        }

        String str = answer.toString().replaceAll("[^0-9 ]","");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str);
        bw.flush();
        bw.close();
    }

    public static boolean isTarget(String s, String t) {
        return s.equals(t);
    }

    public static List<Integer> createTargetIndexes(List<String> input, String target) {
        List<Integer> targetIndexes = new ArrayList<>();

        for (int i =0 ; i<input.size(); i++) {
            String s = input.get(i);
            if (s.equals(target)) {
                targetIndexes.add(i);
            }
        }

        return targetIndexes;
    }

    public static int calculateDistance(List<Integer> targetIndexes, int element) {
        int min = 1000;
        for (Integer i : targetIndexes) {
            int current = i - element;

            if (current < 0) {
                current = -current;
            }

            if ((current) < min) {
                min = current;
            }
        }
        return min;
    }
}
