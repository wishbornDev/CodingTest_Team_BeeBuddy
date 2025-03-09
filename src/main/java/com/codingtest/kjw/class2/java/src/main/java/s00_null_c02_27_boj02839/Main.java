package s00_null_c02_27_boj02839;

import java.util.Scanner;

public class Main {
    static final int SMALL = 3;
    static final int BIG = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int target = sc.nextInt();

        int big = target / BIG;
        int small = 0;

        int total = big * BIG + small * SMALL;
        while (total != target) {
            if (total < target) {
                small += 1;
                total += SMALL;
            }
            if (total > target) {
                big -= 1;
                total -= BIG;
            }
            if (big < 0 || small < 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(big + small);

    }
}
