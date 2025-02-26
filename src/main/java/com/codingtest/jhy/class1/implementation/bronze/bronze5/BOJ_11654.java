package main.java.com.codingtest.jhy.class1.implementation.bronze.bronze5;

import java.io.*;

public class BOJ_11654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int asciiCodeValue = br.readLine().charAt(0);

        bw.write(String.valueOf(asciiCodeValue));
        bw.flush();
        bw.close();
    }

}