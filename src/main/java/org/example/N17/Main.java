package org.example.N17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int cnt = Integer.parseInt(sc.next());
        int[] numbers = new int[cnt];

        int primeCnt = 0;

        for (int i = 0; i < cnt ; i++) {
            numbers[i] = i;
        }
        // 초기화 과정 불필요
        // 인덱스를 숫자로 생각하고, 배열 내부의 값은 flag(소수 여부)로 확인하게 되면 불필요한 할당을 줄일 수 있음
        // 기본적으로 자바는 정수 배열 생성시 0으로 초기화 됨

        for (int i = 2; i < cnt; i++) {
            if (numbers[i] == 0) {
                continue;
            }

            for (int j = i * i; j < cnt; j += i) {
                numbers[j] = 0;
            }
        }

        for (int i : numbers) {
            if (i != 0 && i != 1) {
                primeCnt += 1;
            }
        }

        System.out.println(primeCnt);
    }
}
