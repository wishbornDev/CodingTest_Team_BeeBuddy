package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_18110 {
    private static final double TRIM_NUM = 0.15;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opinionLength = Integer.parseInt(br.readLine());

        if (opinionLength == 0) {
            System.out.println(0);
            return;
        }

        List<Integer> level = new ArrayList<>();
        for (int i = 0; i < opinionLength; i++) {
            level.add(Integer.parseInt(br.readLine()));
        }

        level.sort((a, b) -> a - b);


        int trimNum = (int) Math.round(opinionLength * TRIM_NUM);
        int startIdx = trimNum;
        int endIdx = opinionLength - trimNum;

        int sum = 0;
        for (int i = startIdx; i < endIdx; i++) {
            sum += level.get(i);
        }

        int result = Math.round((float) sum / (endIdx - startIdx));
        System.out.println(result);
    }
}
