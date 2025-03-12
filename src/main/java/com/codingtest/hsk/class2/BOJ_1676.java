package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1676 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            int count = 0;
            while (N >= 5) {
                count += N / 5;
                N /= 5;
            }

            System.out.println(count);
        }
}
