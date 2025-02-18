package main.java.com.codingtest.jhy.class1.string.bronze.bronze5;

import java.io.*;

public class BOJ_27866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(s.charAt(i - 1)));
        bw.flush();
        bw.close();
    }

}