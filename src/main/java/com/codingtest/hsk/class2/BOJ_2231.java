package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2231 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        int start = Math.max(1, N-9*(String.valueOf(N)).length());

        for (int i=start; i<N; i++) {
            int sum = digitSum(i);
            if (sum == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    public static int digitSum(int i) {
        int sum = i;
        while (i>0) {
            sum += i % 10;
            i /= 10;
        }

        return sum;
    }
}
