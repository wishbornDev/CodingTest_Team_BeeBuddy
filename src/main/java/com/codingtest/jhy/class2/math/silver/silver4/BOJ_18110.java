package main.java.com.codingtest.jhy.class2.math.silver.silver4;

import java.io.*;
import java.util.Arrays;

public class BOJ_18110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int trimmedMeanValue = (int) Math.round(n * 0.15);
        int avg = 0;

        for (int i = trimmedMeanValue; i < n - trimmedMeanValue; i++) {
            avg += arr[i];
        }

        int result = (int) Math.round((double) avg / (n - trimmedMeanValue * 2));

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

}