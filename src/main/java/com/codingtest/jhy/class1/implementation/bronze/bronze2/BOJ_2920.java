package main.java.com.codingtest.jhy.class1.implementation.bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[st.countTokens()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ascCount = 0;
        int descCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])  {
                ascCount++;
            } else {
                descCount++;
            }
        }

        bw.write(ascCount == 7 ? "ascending" : (descCount == 7 ? "descending" : "mixed"));
        bw.flush();
        bw.close();
    }

}