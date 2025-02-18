package main.java.com.codingtest.jhy.class1.math.bronze.bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            sb.append(a + b)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}