package main.java.com.codingtest.jhy.class2.greedy.silver.silver4;

import java.io.*;

public class BOJ_2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;

        int count = n / 5;

        while (count >= 0) {
            int temp = n - count * 5;

            if (temp % 3 == 0) {
                min = Math.min(min, count + temp / 3);
                break;
            }
            count--;
        }

        bw.write(String.valueOf(min == Integer.MAX_VALUE ? -1 : min));
        bw.flush();
        br.close();
    }

}