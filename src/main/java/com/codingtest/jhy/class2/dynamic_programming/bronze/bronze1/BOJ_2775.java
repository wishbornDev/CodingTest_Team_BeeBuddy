package main.java.com.codingtest.jhy.class2.dynamic_programming.bronze.bronze1;

import java.io.*;

public class BOJ_2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCases = Integer.parseInt(br.readLine());

        int[][] dp = new int[15][15];

        for (int i = 1; i < 15; i++) {
            dp[0][i] = i;
            dp[i][1] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        while (testCases-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(dp[k][n])
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}