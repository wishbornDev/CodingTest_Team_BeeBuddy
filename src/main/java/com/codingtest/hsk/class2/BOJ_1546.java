package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1546 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numList = new int[N];
        for (int i = 0; i < N; i++) numList[i] = Integer.parseInt(st.nextToken());

        int max = Arrays.stream(numList).max().getAsInt();
        double sum = Arrays.stream(numList).mapToDouble(x -> (x * 100.0 / max)).sum();

        System.out.println(sum / N);
    }
}


