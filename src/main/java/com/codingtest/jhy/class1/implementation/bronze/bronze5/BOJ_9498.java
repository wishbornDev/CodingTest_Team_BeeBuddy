package main.java.com.codingtest.jhy.class1.implementation.bronze.bronze5;

import java.io.*;

public class BOJ_9498 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testScore = Integer.parseInt(br.readLine());

        if (testScore >= 90 &&  testScore <= 100) {
            bw.write("A");
        } else if (testScore >= 80 && testScore <= 89) {
            bw.write("B");
        } else if (testScore >= 70 && testScore <= 79) {
            bw.write("C");
        } else if (testScore >= 60 && testScore <= 69) {
            bw.write("D");
        } else {
            bw.write("F");
        }

        bw.flush();
        bw.close();
    }

}