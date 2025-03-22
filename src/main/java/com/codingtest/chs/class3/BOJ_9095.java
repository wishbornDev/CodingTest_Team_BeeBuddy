package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9095 {
    private static int[] dp = new int[12];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        dp = new int[12];

        while(testCase-- > 0){
            int num = Integer.parseInt(br.readLine());
            sb.append(checker(num)).append("\n");
        }
        System.out.println(sb);
    }

    private static int checker(int num){
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        if(num == 1){
            return dp[1];
        }
        if(num == 2){
            return dp[2];
        }
        if(num == 3){
            return dp[3];
        }

        for(int i = 4; i <= num; i++){
            if(dp[i] == 0){
                dp[i] = dp[i -1] + dp[i -2] +dp[i - 3];
            }
        }
        return dp[num];
    }
}
