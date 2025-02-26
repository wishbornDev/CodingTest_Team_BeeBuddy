package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2920 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] notes = new int[8];

        for (int i = 0; i < 8; i++) {
            notes[i] = Integer.parseInt(st.nextToken());
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i=0; i<7; i++) {
            if (notes[i] > notes[i+1]) {
                isAscending = false;
            }
            if (notes[i] < notes[i+1]) {
                isDescending = false;
            }
        }

        if (isAscending) System.out.println("ascending");
        else if (isDescending) System.out.println("descending");
        else System.out.println("mixed");

    }

    public static void main(String[] args) throws Exception {
        new BOJ_2920().solution();
    }
}

