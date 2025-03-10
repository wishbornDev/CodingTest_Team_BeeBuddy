package main.java.com.codingtest.jhy.class2.sorting.silver.silver5;

import java.io.*;
import java.util.*;

public class BOJ_1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            set.add(word);
        }

        List<String> sortWords = new ArrayList<>(set);
        sortWords.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });

        for (String sortWord : sortWords) {
            sb.append(sortWord)
                    .append("\n");
        }

        bw.write(sortWords.toString());
        bw.flush();
        bw.close();
    }

}