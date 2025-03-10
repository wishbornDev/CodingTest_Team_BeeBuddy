package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int nextNum = 1;

        for (int i = 0; i < length; i++) {
            int targetNum = Integer.parseInt(br.readLine());

            while (nextNum <= targetNum) {
                stack.push(nextNum++);
                sb.append("+\n");
            }

            if (stack.peek() == targetNum) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }
}
