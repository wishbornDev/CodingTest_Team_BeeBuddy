package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_27866 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(S.charAt(i-1));

    }
    public static void main(String[] args) throws Exception{
        new BOJ_27866().solution();
    }
}
