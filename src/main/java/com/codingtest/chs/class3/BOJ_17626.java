package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num + 1];
        dp[1] = 1;
        for(int i = 2; i <= num; i++){
            int minNum = Integer.MAX_VALUE;
            for(int j = 1; j*j <= i; j++){
                minNum = Math.min(minNum, dp[i - j*j]);
            }
            dp[i] = minNum + 1;
        }
        System.out.println(dp[num]);
    }
}
