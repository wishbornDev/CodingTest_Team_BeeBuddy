package main.java.com.codingtest.jhy.class1.math.bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        st = new  StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            max = Math.max(value,max);
            min = Math.min(value,min);
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }

}