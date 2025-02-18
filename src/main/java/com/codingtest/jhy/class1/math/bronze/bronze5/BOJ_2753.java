package main.java.com.codingtest.jhy.class1.math.bronze.bronze5;

import java.io.*;

public class BOJ_2753 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 1 : 0));
        bw.flush();
        bw.close();
    }

}