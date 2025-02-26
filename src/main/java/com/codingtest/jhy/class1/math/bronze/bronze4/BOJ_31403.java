package main.java.com.codingtest.jhy.class1.math.bronze.bronze4;

import java.io.*;

public class BOJ_31403 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        bw.write((a + b - c) + "\n" + (Integer.parseInt(String.valueOf(a) + String.valueOf(b)) - c));
        bw.flush();
        bw.close();
    }

}