package main.java.com.codingtest.jhy.class2.math.bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int days = (int) (Math.ceil((double) (v - a) / (a - b)) + 1);

        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();
    }

}