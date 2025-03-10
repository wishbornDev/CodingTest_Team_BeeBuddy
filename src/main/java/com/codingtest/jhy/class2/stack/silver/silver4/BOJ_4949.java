package main.java.com.codingtest.jhy.class2.stack.silver.silver4;

import java.io.*;
import java.util.Stack;

public class BOJ_4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();

            if (input.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                }

                if ((stack.isEmpty() || stack.peek() != '(') && c == ')') {
                    stack.push(c);
                    break;
                } else if ((stack.isEmpty() || stack.peek() != '[') && c == ']') {
                    stack.push(c);
                    break;
                }

                if (!stack.isEmpty()) {
                    if (stack.peek() == '(' && c == ')') {
                        stack.pop();
                    } else if (stack.peek() == '[' && c == ']') {
                        stack.pop();
                    }
                }
            }
            sb.append(stack.isEmpty() ? "yes\n" : "no\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}