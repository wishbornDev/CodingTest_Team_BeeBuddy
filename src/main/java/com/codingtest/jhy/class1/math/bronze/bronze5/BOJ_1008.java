package main.java.com.codingtest.jhy.class1.math.bronze.bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1008 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf((double) a / b));
        bw.flush();
        bw.close();
    }

}