package org.example.N14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.next());
        List<Integer> integers = new ArrayList<>();
        int cnt = 1;

        while (integers.size() != count) {
            integers.add(Integer.parseInt(sc.next()));
        }

        int flag = integers.get(0);

        for (int i = 1; i < count; i++) {
            if (flag < integers.get(i)) {
                cnt++;
                flag = integers.get(i);
            }
        }

        System.out.println(cnt);

    }
}


