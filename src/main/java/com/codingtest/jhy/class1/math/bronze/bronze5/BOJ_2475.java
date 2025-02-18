package main.java.com.codingtest.jhy.class1.math.bronze.bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2475 {

    private static final int DIVISOR = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int squaredDigitSum = 0;

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(st.nextToken());
            squaredDigitSum += n * n;
        }

        bw.write(String.valueOf((squaredDigitSum % DIVISOR)));
        bw.flush();
        bw.close();
    }

}