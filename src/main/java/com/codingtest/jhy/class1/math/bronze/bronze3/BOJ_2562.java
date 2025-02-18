package main.java.com.codingtest.jhy.class1.math.bronze.bronze3;

import java.io.*;

public class BOJ_2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int findMaxIndex = 0, max = 0;

        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number > max) {
                max = number;
                findMaxIndex = i + 1;
            }
        }

        bw.write(max + "\n" + findMaxIndex);
        bw.flush();
        bw.close();
    }

}