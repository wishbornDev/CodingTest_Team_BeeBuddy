package s00_null_c02_18_boj01676;

import java.util.Scanner;

public class Main {
    // 소인수분해 했을 때 5의 지수가 얼마인 지 구하면 됨 (10 = 2*5)
    static final int DIVISOR = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int target = sc.nextInt();
        int count = 0;

        int current = target;
        while (current > 0) {
            current = current / DIVISOR;
            count += current;
        }

        System.out.println(count);
    }
}
