package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2475 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        for (int i=0; i<5; i++) {
            sum += (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        }
        System.out.println(sum%10);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_2475().solution();
    }
}
