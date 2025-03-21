package main.java.com.codingtest.jhy.class2.math.bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11050 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = 1;

        for (int i = n; i > n - k; i--) {
            result *= i;
        }

        for (int i = 1; i <= k; i++) {
            result /= i;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

}