package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int testCase = Integer.parseInt(br.readLine());
        int sum = 0;

        while(testCase-- > 0){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) stack.pop();
            else stack.push(num);
        }

        while(!stack.isEmpty()) sum += stack.pop();

        System.out.println(sum);
    }
}
