package main.java.com.codingtest.jhy.class2.math.bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int primeNumberCount = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());

            if (isPrimeNumber(number)) {
                primeNumberCount++;
            }
        }

        bw.write(String.valueOf(primeNumberCount));
        bw.flush();
        bw.close();
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}