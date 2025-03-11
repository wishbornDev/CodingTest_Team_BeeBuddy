package s00_null_c01_34_boj03052;

import java.util.Scanner;

public class Main {
    static final int MOD = 42;
    static final int INPUT = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[INPUT];
        int[] remainders = new int[MOD];
        for (int i = 0; i < INPUT; i++) {
            inputs[i] = sc.nextInt();
            int remainder = inputs[i] % MOD;
            remainders[remainder] = 1;
        }
        int sum = 0;
        for (int isVisited : remainders) {
            sum += isVisited;
        }
        System.out.println(sum);

    }
}
