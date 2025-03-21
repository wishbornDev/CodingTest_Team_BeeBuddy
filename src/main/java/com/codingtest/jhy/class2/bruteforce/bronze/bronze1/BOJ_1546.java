package main.java.com.codingtest.jhy.class2.bruteforce.bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        int totalScore = 0;
        int maxScore = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            maxScore = Math.max(arr[i], maxScore);
            totalScore += arr[i];
        }

        double avgScore = (double) totalScore / maxScore * 100 / n;

        bw.write(String.valueOf(avgScore));
        bw.flush();
        bw.close();
    }

}