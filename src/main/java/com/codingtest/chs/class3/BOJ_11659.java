package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659 {
    static int[] nums;
    static int[] sums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int length = Integer.parseInt(st.nextToken());
        int testCase = Integer.parseInt(st.nextToken());
        nums = new int[length + 1];
        sums =new int[length + 1];

        // 정수 배열 입력
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < nums.length; i ++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 구간 배열 구하기
        for(int i = 1; i < sums.length; i++){
            // 이전까지의 합 + 현재 값
            sums[i] = sums[i - 1] + nums[i];
        }

        while(testCase-- > 0){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int result = sums[end] - sums[start- 1];
            sb.append(result).append("\n");
        }

        System.out.append(sb);
    }
}
