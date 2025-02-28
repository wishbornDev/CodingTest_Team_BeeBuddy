package main.java.com.codingtest.jhy.class2.bruteforce.silver.silver5;

import java.io.*;
import java.util.*;

public class BOJ_7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<PersonInfo> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            list.add(new PersonInfo(w, h, 1));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (list.get(i).weight < list.get(j).weight && list.get(i).height < list.get(j).height) {
                    list.get(i).rank++;
                }
            }
            sb.append(list.get(i).rank)
                    .append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static class PersonInfo {

        private final int weight;
        private final int height;
        private int rank;

        public PersonInfo(int weight, int height, int rank) {
            this.weight = weight;
            this.height = height;
            this.rank = rank;
        }
    }

}