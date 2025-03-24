package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2775 {
    static int[][] store = new int[15][15];

    public static int getResidents(int k, int n) {
        if (store[k][n] != 0) return store[k][n];
        if (k == 0) return store[k][n] = n; // 0층 n호는 항상 n명
        if (n == 1) return store[k][n] = 1; // 1호에는 항상 1명

        return store[k][n] = getResidents(k - 1, n) + getResidents(k, n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(getResidents(k, n));
        }
    }
}
