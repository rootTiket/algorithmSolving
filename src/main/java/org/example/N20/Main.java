package org.example.N20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleCount = Integer.parseInt(sc.next());
        List<Integer> scores = new ArrayList<>();
        int[] result = new int[peopleCount];

        Arrays.fill(result, 1);

        for (int i = 0; i < peopleCount; i++) {
            scores.add(Integer.parseInt(sc.next()));
        }

        for (int i = 0; i < peopleCount; i++) {
            int tmp = scores.get(i);
            for (int j = 0; j <peopleCount; j++ ) {
                if (scores.get(j) > tmp) {
                    result[i]++;
                }
            }
        }
        for (int i = 0; i < peopleCount; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
