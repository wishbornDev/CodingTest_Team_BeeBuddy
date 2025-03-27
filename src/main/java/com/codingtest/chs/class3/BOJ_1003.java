package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1003 {
    public class Main {
        static int[][] dp;
        static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int testCase = Integer.parseInt(br.readLine());

            int maxNum = 0;
            int[] inputs = new int[testCase];

            for (int i = 0; i < testCase; i++) {
                inputs[i] = Integer.parseInt(br.readLine());
                maxNum = Math.max(maxNum, inputs[i]);
            }

            dp = new int[Math.max(2, maxNum + 1)][2];
            dp[0] = new int[]{1, 0};
            dp[1] = new int[]{0, 1};

            for (int i = 2; i <= maxNum; i++) {
                dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            }

            for (int num : inputs) {
                sb.append(dp[num][0]).append(" ").append(dp[num][1]).append("\n");
            }

            System.out.println(sb);
        }
    }

}
