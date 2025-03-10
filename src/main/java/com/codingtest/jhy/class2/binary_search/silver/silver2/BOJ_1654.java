package main.java.com.codingtest.jhy.class2.binary_search.silver.silver2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        long right = 0;
        long left = 1;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }

        long result = 0;

        while (left <= right) {
            long count = 0;
            long mid = (left + right) / 2;

            for (int i = 0; i < k; i++) {
                count += arr[i] / mid;
            }

            if (count >= n) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

}