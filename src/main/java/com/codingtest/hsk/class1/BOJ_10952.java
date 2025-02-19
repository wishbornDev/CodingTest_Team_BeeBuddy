package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10952 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A, B;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if (A==0 && B ==0) break;
            System.out.println(A+B);
        }

    }
    public static void main(String[] args) throws Exception {
        new BOJ_10952().solution();
    }
}
