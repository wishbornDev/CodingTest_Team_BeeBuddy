package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2108 {
    private static List<Integer> numList = new ArrayList<>();

    private static int getAvg() {
        int sum = 0;
        for (int num : numList) {
            sum += num;
        }
        return Math.round((float) sum / numList.size());
    }

    private static int getMode() {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int num : numList) {
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }

        int maxCount = Collections.max(hashmap.values());
        List<Integer> modeNumList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() == maxCount) {
                modeNumList.add(entry.getKey());
            }
        }

        Collections.sort(modeNumList);
        return (modeNumList.size() > 1) ? modeNumList.get(1) : modeNumList.get(0);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numSize = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numSize; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numList);

        // 산술 평균
        sb.append(getAvg()).append("\n");

        // 중앙값
        sb.append(numList.get(numList.size() / 2)).append("\n");

        // 최빈값
        sb.append(getMode()).append("\n");

        // 범위
        sb.append(numList.get(numList.size() - 1) - numList.get(0)).append("\n");

        System.out.print(sb);
    }
}
