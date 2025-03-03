package main.java.com.codingtest.jhy.class2.stack.silver.silver2;

import java.io.*;
import java.util.Stack;

public class BOJ_1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int currentNumber = 1;

        for (int i = 1; i <= n; i++) {
            int targetNumber = Integer.parseInt(br.readLine());

            while (currentNumber <= targetNumber) {
                stack.push(currentNumber++);
                sb.append("+\n");
            }

            while (!stack.isEmpty() && stack.peek() == targetNumber) {
                stack.pop();
                sb.append("-\n");
            }
        }

        bw.write(stack.isEmpty() ? sb.toString() : "NO");
        bw.flush();
        bw.close();
    }

}