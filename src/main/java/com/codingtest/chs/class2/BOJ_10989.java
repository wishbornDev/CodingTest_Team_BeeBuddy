package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int numSize = Integer.parseInt(br.readLine());
        int[] arr = new int[numSize];

        for(int i = 0; i < numSize; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        /* 시간 초과 */
        // Arrays.stream(arr).sorted().forEach(v -> System.out.println(v));
        Arrays.sort(arr);
        for(int i : arr){
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
