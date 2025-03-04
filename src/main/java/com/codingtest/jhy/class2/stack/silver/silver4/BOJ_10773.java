package main.java.com.codingtest.jhy.class2.stack.silver.silver4;

import java.io.*;
import java.util.Stack;

public class BOJ_10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n != 0) {
                stack.push(n);
            } else if (!stack.isEmpty() && n == 0) {
                stack.pop();
            }
        }

        int sum = 0;

        for (Integer val : stack) {
            sum += val;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }

}