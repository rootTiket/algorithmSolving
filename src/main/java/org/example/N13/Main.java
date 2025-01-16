package org.example.N13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.next());
        List<Integer> integers = new ArrayList<>();

        while (integers.size() != count) {
            integers.add(Integer.parseInt(sc.next()));
        }

        int flag = integers.get(0);
        StringBuilder sb = new StringBuilder(Integer.toString(flag));

        for (int i = 1; i < count; i++) {
            if (flag < integers.get(i)) {
                sb.append(" ").append(Integer.toString(integers.get(i)));
            }
            flag = integers.get(i);
        }

        System.out.println(sb.toString());

    }
}
