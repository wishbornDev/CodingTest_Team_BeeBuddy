package main.java.com.codingtest.jhy.class1.math.bronze.bronze4;

import java.io.*;

public class BOJ_11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =  Integer.parseInt(br.readLine());
        String str =  br.readLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += str.charAt(i) - '0';
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }

}