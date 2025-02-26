package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2753 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        if ((N%4==0 && N%100!=0) || N%400==0) System.out.println(1);
        else System.out.println(0);
    }
    public static void main(String[] args) throws Exception{
        new BOJ_2753().solution();
    }
}

