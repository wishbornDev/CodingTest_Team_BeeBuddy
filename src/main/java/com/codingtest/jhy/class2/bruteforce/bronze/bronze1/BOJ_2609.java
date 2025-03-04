package main.java.com.codingtest.jhy.class2.bruteforce.bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = 0;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        int lcm = a * b / gcd;

        bw.write(gcd + "\n" + lcm);
        bw.flush();
        bw.close();
    }

}