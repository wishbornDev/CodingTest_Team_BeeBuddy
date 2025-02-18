package main.java.com.codingtest.jhy.class1.math.bronze.bronze2;

import java.io.*;
import java.util.*;

public class BOJ_3052 {

    private static final int REMAINDER_BASE = 42;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            set.add(number % REMAINDER_BASE);
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
    }

}