package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2439 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            for (int j=1; j<N-i; j++) {
                System.out.print(' ');
            }
            for (int j=N-i; j<=N; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception{
        new BOJ_2438().solution();
    }
}
