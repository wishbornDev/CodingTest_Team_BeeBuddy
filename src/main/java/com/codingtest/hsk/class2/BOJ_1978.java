package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = N;
        int num;
        for (int i=0; i<N; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num<2) count --;
            for (int j=2; j*j<=num; j++) {
                if (num%j==0 && num!=j) {
                    count --;
                    break;
                }
            }
        }

        System.out.println(count);

    }
    public static void main(String[] args) throws Exception {
        new BOJ_1978().solution();
    }
}
