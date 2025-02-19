package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2562 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int num = 0;

        for (int i=0; i<9; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp > max) {
                max = temp;
                num = i;
            }
        }

        System.out.println(max);
        System.out.println(num+1);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_2562().solution();
    }
}
