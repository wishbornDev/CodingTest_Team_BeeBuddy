package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2884 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M>=45) {
            M -= 45;
        } else {
            if (H==0) H = 23;
            else H -= 1;
            M = M + 60 - 45;
        }

        System.out.println(H+" "+M);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_2884().solution();
    }
}
