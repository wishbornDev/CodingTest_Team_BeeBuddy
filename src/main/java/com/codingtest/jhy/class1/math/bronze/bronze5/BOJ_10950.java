package main.java.com.codingtest.jhy.class1.math.bronze.bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10950 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}