package main.java.com.codingtest.jhy.class2.math.bronze.bronze3;

import java.io.*;
import java.util.*;

public class BOJ_4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            List<Integer> list = new ArrayList<>();

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 3; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0) {
                break;
            }

            Collections.sort(list);

            sb.append(isRightTriangle(list) ? "right" : "wrong")
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isRightTriangle(List<Integer> list) {
        return Math.pow(list.get(2), 2) == Math.pow(list.get(1), 2) + Math.pow(list.get(0), 2);
    }

}