package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> numSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            numSet.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(numSet.contains(num) ? 1 : 0).append("\n");
        }

        System.out.println(sb);
    }
}
