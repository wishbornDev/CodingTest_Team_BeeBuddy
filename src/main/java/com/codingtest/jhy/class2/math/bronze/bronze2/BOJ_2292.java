package main.java.com.codingtest.jhy.class2.math.bronze.bronze2;

import java.io.*;

public class BOJ_2292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int lastNumberInLayer = 1;
        int moveCount = 1;

        while (n > lastNumberInLayer) {
            lastNumberInLayer += 6 * moveCount;
            moveCount++;
        }

        bw.write(String.valueOf(moveCount));
        bw.flush();
        bw.close();
    }

}