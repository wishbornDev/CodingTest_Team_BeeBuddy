package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2775 {
    // i-1 층의 0 ~ tNum까지 사는 인원 계산
    private static int livedNum(int[] arr, int tNum){
        int sum = 0;
        for(int i = 0; i <= tNum; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase-- > 0){
            int row = Integer.parseInt(br.readLine());
            int col = Integer.parseInt(br.readLine());

            // 0 층부터 row 층까지 존재해야함!
            int[][] apart = new int[row + 1][col];

            for(int i = 0; i < apart.length; i++){
                for(int j = 0; j < apart[0].length; j++){
                    // 0 층인 경우
                    if(i == 0) apart[i][j] = j+1;

                        // 한 층 아래 j까지 사는 인원 계산
                    else apart[i][j] = livedNum(apart[i - 1], j);
                }
            }

            System.out.println(apart[row][col - 1]);
        }
    }
}
