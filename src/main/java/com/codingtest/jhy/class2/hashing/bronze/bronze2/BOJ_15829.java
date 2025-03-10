package main.java.com.codingtest.jhy.class2.hashing.bronze.bronze2;

import java.io.*;

public class BOJ_15829 {

    private static final int R = 31;
    private static final int M = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long hashValue = 0L;
        long pow = 1L;

        for (int i = 0; i < n; i++) {
            int ch = str.charAt(i) - 'a' + 1;
            hashValue = (hashValue + (ch * pow) % M) % M;
            pow = (pow * R) % M;
        }

        bw.write(String.valueOf(hashValue));
        bw.flush();
        bw.close();
    }

}