package main.java.com.codingtest.jhy.class2.stack.silver.silver4;

import java.io.*;
import java.util.Stack;

public class BOJ_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();

            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);

                if (c == '(') {
                    stack.push(c);
                }

                if ((stack.isEmpty() || stack.peek() != '(') && c == ')') {
                    stack.push(c);
                }

                if (!stack.isEmpty() && stack.peek() == '(' && c == ')') {
                    stack.pop();
                }
            }
            sb.append(stack.isEmpty() ? "YES\n" : "NO\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}