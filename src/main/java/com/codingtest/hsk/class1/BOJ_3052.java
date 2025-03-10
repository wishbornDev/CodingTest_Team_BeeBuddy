package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_3052 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> remainders = new HashSet<>(); // 나머지를 저장할 Set

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            remainders.add(num % 42);
        }

        System.out.println(remainders.size());
    }

    public static void main(String[] args) throws Exception {
        new BOJ_3052().solution();
    }
}