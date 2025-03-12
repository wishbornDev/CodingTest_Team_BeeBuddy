package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int addNum = 1;
        boolean isPossible = true;

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());

            while (addNum <= num) {
                stack.push(addNum++);
                sb.append("+\n");
            }

            if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }
        System.out.println(isPossible ? sb.toString() : "NO");
    }
}
