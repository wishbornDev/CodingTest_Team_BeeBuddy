package s00_null_c01_26_boj02562;

import java.util.Scanner;

public class Main {
    static final int LEN = 9;

    public static void main(String[] args) {
        int[] nums = new int[LEN];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < LEN; i++) {
            nums[i] = sc.nextInt();
        }

        int max = 0;
        int maxIdx = 1;
        for (int i = 1; i <= LEN; i++) {
            if (nums[i - 1] > max) {
                max = nums[i - 1];
                maxIdx = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx);
    }
}
