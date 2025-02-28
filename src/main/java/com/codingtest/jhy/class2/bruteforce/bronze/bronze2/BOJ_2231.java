package main.java.com.codingtest.jhy.class2.bruteforce.bronze.bronze2;

import java.io.*;

public class BOJ_2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int constructor = 0;

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = i;
            int temp = i;

            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }
            if (sumOfDigits == n) {
                constructor = i;
                break;
            }
        }

        bw.write(String.valueOf(constructor));
        bw.flush();
        bw.close();
    }

}