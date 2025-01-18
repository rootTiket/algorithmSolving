package org.example.N22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int[][] nums = new int[num][num];

        int cnt = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                nums[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int center = nums[i][j];
                if (center > (j + 1 >= num ? 0 : nums[i][j + 1]) &&
                        center > (j - 1 < 0 ? 0 : nums[i][j - 1]) &&
                        center > (i + 1 >= num ? 0 : nums[i + 1][j]) &&
                        center > (i - 1 < 0 ? 0 : nums[i - 1][j])
                ) {
                    cnt++;
                }

            }
        }

        System.out.println(cnt);
    }
}
