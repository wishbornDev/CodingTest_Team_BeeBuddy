package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_15829 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long sum = 0;
        long r = 1;
        int M = 1234567891;
        int R = 31;
        for (int i=0; i<L; i++) {
            int value = str.charAt(i) - 'a' + 1;
            sum = (sum + value * r) % M;
            r = (r * R) % M;
        }

        System.out.println(sum);

    }
}
