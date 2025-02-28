package main.java.com.codingtest.jhy.class2.string.bronze.bronze1;

import java.io.*;

public class BOJ_1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals("0")) {
                break;
            }

            boolean isPalindrome = true;

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            sb.append(isPalindrome ? "yes" : "no")
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}