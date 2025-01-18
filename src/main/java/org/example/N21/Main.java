package org.example.N21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int[][] nums = new int[num][num];
        List<Integer> sums = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                nums[i][j] = Integer.parseInt(sc.next());
            }
        }

        //모든 행
        for (int i = 0; i < num; i++) {
            int sum = 0;
            for (int j = 0; j < num; j++) {
                sum += nums[i][j];
            }
            sums.add(sum);
        }

        // 모든 열
        for (int i = 0; i < num; i++) {
            int sum = 0;
            for (int j = 0; j < num; j++) {
                sum += nums[j][i];
            }
            sums.add(sum);
        }

        int sum = 0;

        // 정 대각선
        for (int i = 0; i < num; i++) {
            sum += nums[i][i];
        }
        sums.add(sum);

        sum = 0;

        //반대 대각선
        for (int i = 0; i < num; i++) {
            sum += nums[i][num - i -1];
        }
        sums.add(sum);
        Collections.sort(sums,Collections.reverseOrder());
        System.out.println(sums.get(0));
    }
}
