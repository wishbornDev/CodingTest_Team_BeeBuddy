package main.java.com.codingtest.jhy.class3.greedy.silver.silver4;

import java.io.*;
import java.util.*;

public class BOJ_11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (k >= arr[i]) {
                count += k / arr[i];
                k %= arr[i];
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

}