package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();

        Arrays.stream(arr)
                .sorted((o1, o2) -> Integer.compare(
                        Integer.parseInt(o1.split(" ")[0]),
                        Integer.parseInt(o2.split(" ")[0])
                ))
                .forEach(line -> sb.append(line).append("\n"));

        System.out.print(sb);
    }
}
