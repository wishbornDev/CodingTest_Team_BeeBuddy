package main.java.com.codingtest.jhy.class2.math.silver.silver3;

import java.io.*;
import java.util.*;

public class BOJ_2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];
        int arithmeticMean = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            arithmeticMean += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 1) + 1);
        }

        Arrays.sort(arr);

        int maxValue = 0;

        for (Integer val : map.values()) {
            maxValue = Math.max(maxValue, val);
        }

        List<Integer> modeList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                modeList.add(entry.getKey());
            }
        }

        Collections.sort(modeList);
        int mostFrequentValue = modeList.size() > 1 ? modeList.get(1) : modeList.get(0);

        sb.append((int) Math.round((double) arithmeticMean / n)).append("\n")
                .append(arr[n / 2]).append("\n")
                .append(mostFrequentValue).append("\n")
                .append(arr[n - 1] - arr[0]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}