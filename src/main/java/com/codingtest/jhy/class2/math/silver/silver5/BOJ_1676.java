package main.java.com.codingtest.jhy.class2.math.silver.silver5;

import java.io.*;
import java.math.BigInteger;

/* 메모리 : 14580 KB, 시간 : 112 ms */
public class BOJ_1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        String stringTypeFactorial = String.valueOf(factorial);
        int count = 0;

        for (int i = stringTypeFactorial.length() - 1; i >= 0; i--) {
            if (stringTypeFactorial.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

}