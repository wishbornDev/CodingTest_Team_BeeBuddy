package main.java.com.codingtest.jhy.class2.bruteforce.silver.silver5;

import java.io.*;

public class BOJ_1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String result;
        int count = 0;

        for (int i = 666; ; i++) {
            if (String.valueOf(i).contains("666")) {
                count++;
            }
            if (count == n) {
                result = String.valueOf(i);
                break;
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
    }

}