package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_10828 {
    private static Stack<Integer> stack = new Stack<>();

    private static void push(int num) {
        stack.push(num);
    }

    private static int pop() {
        return stack.isEmpty() ? -1 : stack.pop();
    }

    private static int size() {
        return stack.size();
    }

    private static int empty() {
        return stack.isEmpty() ? 1 : 0;
    }

    private static int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String[] order = br.readLine().split(" ");

            switch (order[0]) {
                case "push":
                    push(Integer.parseInt(order[1]));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
