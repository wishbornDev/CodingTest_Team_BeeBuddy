package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11050 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int numerator = 1;
        for(int i=0; i<K; i++) numerator = numerator * (N-i);
        int denominator = 1;
        while (K>0) {
            denominator = denominator * K;
            K--;
        }

        System.out.println(numerator/denominator);
    }
}
