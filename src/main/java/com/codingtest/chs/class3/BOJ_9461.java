package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9461 {
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        while(testCase-- > 0){
            int num = Integer.parseInt(br.readLine());
            sb.append(padovan(num)).append("\n");
        }
        System.out.println(sb);
    }

    private static long padovan(int num){
        if(num < 4) return dp[num];

        for(int i = 4; i <= num; i++){
            if(dp[i] == 0){
                dp[i] = dp[i-3] + dp[i - 2];
            }
        }
        return dp[num];
    }
}
