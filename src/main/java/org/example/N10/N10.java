package org.example.N10;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String target = sc.next();
        int i = 1;
        List<Integer> checkIndex = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        char[] arr = input.toCharArray();
        for (int j = 0; j<input.length();j++) {
            if (arr[j] == target.charAt(0)) {
                i = 0;
                checkIndex.add(i);
            } else {
                checkIndex.add(i);
            }
            i++;
        }
        List<Integer> checkIndex2 = new ArrayList<>();
        i = 1;
        for (int j = input.length()-1; j >= 0; j--) {
            if (arr[j] == target.charAt(0)) {
                i = 0;
                checkIndex2.add(i);
            } else {
                checkIndex2.add(i);
            }
            i ++;
        }

        for (int j = 0; j < input.length(); j++) {
            if (checkIndex.get(j) < checkIndex2.get(input.length() - 1 - j)) {
                result.add(checkIndex.get(j));
            } else if (checkIndex.get(j) > checkIndex2.get(input.length() - 1 - j)) {
                result.add(checkIndex2.get(input.length() - 1 - j));
            } else if (checkIndex.get(j) == checkIndex2.get(input.length() - 1 - j)) {
                result.add(checkIndex.get(j));
            } else {
                result.add(0);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer k : result) {
            sb.append(k);
            sb.append(" ");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
