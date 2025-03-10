package s00_null_c02_28_boj04949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            String input;
            while (!(input = br.readLine()).equals(".")) {
                Stack<Character> stack = new Stack<>();
                String isBalanced = "yes";
                for (char c : input.toCharArray()) {
                    if (c == '(') {
                        stack.push(c);
                    } else if (c == '[') {
                        stack.push(c);
                    } else if (c == ')') {
                        if (stack.isEmpty()) {
                            isBalanced = "no";
                            break;
                        } else {
                            if (stack.pop() != '(') {
                                isBalanced = "no";
                                break;
                            }
                        }
                    } else if (c == ']') {
                        if (stack.isEmpty()) {
                            isBalanced = "no";
                            break;
                        } else {
                            if (stack.pop() != '[') {
                                isBalanced = "no";
                                break;
                            }
                        }
                    }
                    if (stack.isEmpty()) {
                        isBalanced = "yes";
                    } else {
                        isBalanced = "no";
                    }
                }
                sb.append(isBalanced)
                        .append(System.lineSeparator());
            }
            System.out.println(sb.toString().trim());
        }
    }
}
