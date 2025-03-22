package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num + 1];

        if(num >= 1) dp[1] = 0;

        for(int i = 2; i <= num; i++){
            dp[i] = dp[i - 1] + 1;
            // 3의 배수
            if(i%3 == 0){
                dp[i] = Math.min(dp[i/3] + 1, dp[i]);
            }
            // 2의 배수
            if (i % 2 == 0){
                // 하나 빼고 연산한게 더 작은 경우 고려하기!
                dp[i] = Math.min(dp[i/2] + 1, dp[i]);
            }
            // 그 외
        }
        System.out.println(dp[num]);
    }
}
