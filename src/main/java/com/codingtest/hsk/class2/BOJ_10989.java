package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] numList = new int[N];
        for (int i=0; i<N; i++) {
            numList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numList);

        StringBuilder sb = new StringBuilder();
        for (int num : numList) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
