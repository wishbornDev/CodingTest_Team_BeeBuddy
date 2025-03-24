package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1654 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long max = 0;
        for (int i=0; i<K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        long left = 1, right = max;
        long result = 0;
        while(left<=right) {
            long mid = (left + right)/2;

            long count = 0;
            for (int i = 0; i < K; i++) {
                count += arr[i] / mid;
            }
            if (count >= N) {
            result = mid;
            left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        System.out.println(result);
    }
}
