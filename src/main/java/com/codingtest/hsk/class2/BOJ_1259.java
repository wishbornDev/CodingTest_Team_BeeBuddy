package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1259 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String num = br.readLine();
            if (num.equals("0")) break;

            int length = num.length();
            boolean isPalindrome = true;

            for (int i = 0; i < length / 2; i++) {
                if (num.charAt(i) != num.charAt(length - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            sb.append(isPalindrome ? "yes\n" : "no\n");
        }
        System.out.print(sb);
    }
}
