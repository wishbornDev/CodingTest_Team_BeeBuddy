package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1152 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if (input == null || input.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        StringTokenizer st = new StringTokenizer(input);
        System.out.println(st.countTokens());
    }

    public static void main(String[] args) throws Exception {
        new BOJ_1152().solution();
    }
}

