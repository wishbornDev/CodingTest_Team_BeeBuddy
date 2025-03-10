package main.java.com.codingtest.jhy.class1.math.bronze.bronze2;

import java.io.*;

public class BOJ_2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] numbers = new int[10];

        String calculateResult = String.valueOf(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));

        for (int i = 0; i < calculateResult.length(); i++) {
            numbers[calculateResult.charAt(i) - '0']++;
        }

        for (int n : numbers) {
            sb.append(n)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}