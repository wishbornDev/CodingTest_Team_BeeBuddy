package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 666;

        while (count < N) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            if (count < N) {
                num++;
            }
        }
        System.out.println(num);
    }
}
