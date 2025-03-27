package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2579 {
    public class Main {
        static int[] dp;
        static int[] stair;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            stair = new int[n + 1];
            dp = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                stair[i] = Integer.parseInt(br.readLine());
            }

            if (n >= 1) dp[1] = stair[1];
            if (n >= 2) dp[2] = stair[1] + stair[2];

            int result = getMaxNum(n);
            System.out.println(result);
        }

        private static int getMaxNum(int num) {
            for (int i = 3; i <= num; i++) {
                // 1. -2 구간에서 2칸 올라온 경우
                // 2. -3 구간에서 2칸 1칸 올라온 경우
                dp[i] = Math.max(dp[i - 3] + stair[i - 1], dp[i - 2]) + stair[i];
            }
            return dp[num];
        }
    }

}
