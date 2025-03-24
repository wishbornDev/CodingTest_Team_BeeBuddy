package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2108 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        sb.append(Math.round((double)sum/N)).append("\n");

        Arrays.sort(arr);
        sb.append(arr[N/2]).append("\n");

        int max = Collections.max(map.values());
        List<Integer> candidate = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) candidate.add(entry.getKey());
        }
        Collections.sort(candidate);
        sb.append(candidate.size() > 1 ? candidate.get(1) : candidate.get(0)).append("\n");

        sb.append(arr[N-1]-arr[0]);

        System.out.println(sb.toString());
    }
}
