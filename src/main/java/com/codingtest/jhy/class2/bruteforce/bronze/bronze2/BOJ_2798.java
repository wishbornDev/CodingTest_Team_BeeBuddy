package main.java.com.codingtest.jhy.class2.bruteforce.bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cardNumbers = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cardNumbers[i] = Integer.parseInt(st.nextToken());
        }

        int maxClosestSum = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int currentSum = cardNumbers[i] + cardNumbers[j] + cardNumbers[k];

                    if (currentSum <= m && currentSum > maxClosestSum) {
                        maxClosestSum = currentSum;
                    }
                }
            }
        }

        bw.write(String.valueOf(maxClosestSum));
        bw.flush();
        bw.close();
    }

}