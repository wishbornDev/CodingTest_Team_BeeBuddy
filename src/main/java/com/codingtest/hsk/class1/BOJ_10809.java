package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10809 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] firstOccurrence = new int[26];
        for (int i = 0; i < 26; i++) {
            firstOccurrence[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            if (firstOccurrence[S.charAt(i) - 'a'] == -1) {
                firstOccurrence[S.charAt(i) - 'a'] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(firstOccurrence[i] + " ");
        }

    }
    public static void main(String[] args) throws Exception{
        new BOJ_10809().solution();
    }
}
