package main.java.com.codingtest.jhy.class1.string.bronze.bronze2;

import java.io.*;
import java.util.Arrays;

public class BOJ_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        for (int i = 0; i < s.length(); i++) {
            if (alphabet[s.charAt(i) - 'a'] == -1) {
                alphabet[s.charAt(i) - 'a'] = i;
            }
        }

        for (int val : alphabet) {
            sb.append(val)
                    .append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}