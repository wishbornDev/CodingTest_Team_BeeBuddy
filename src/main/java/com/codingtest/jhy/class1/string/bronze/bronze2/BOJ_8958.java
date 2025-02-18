package main.java.com.codingtest.jhy.class1.string.bronze.bronze2;

import java.io.*;

public class BOJ_8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            String quiz =  br.readLine();
            int score = 0;
            int count = 0;

            for (int i = 0; i < quiz.length(); i++) {
                if (quiz.charAt(i) == 'O') {
                    score += ++count;
                } else {
                    count = 0;
                }
            }

            sb.append(score)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}