package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2739 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for (int i=1; i<10; i++) {
            System.out.println(N+" * "+i+" = "+(N*i));
        }
    }
    public static void main(String[] args) throws Exception{
        new BOJ_2739().solution();
    }
}
