package main.java.com.codingtest.jhy.class2.math.bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_30802 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] shirtSizes = new int[6];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            shirtSizes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int totalTShirtsNeeded = 0;

        for (int i = 0; i < 6; i++) {
            totalTShirtsNeeded += (int) Math.ceil((double) shirtSizes[i] / t);
        }

        bw.write(totalTShirtsNeeded + "\n" + n / p + " " + n % p);
        bw.flush();
        bw.close();
    }

}