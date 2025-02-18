package main.java.com.codingtest.jhy.class1.implementation.bronze.bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new  StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int a =  Integer.parseInt(st.nextToken());

            if (a < x) {
                sb.append(a)
                        .append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}