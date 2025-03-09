package s00_null_c02_29_boj09012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int lines = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < lines; i++) {
                String input = br.readLine();
                Stack<Character> stack = new Stack<>();
                String message = "YES";
                for (char c : input.toCharArray()) {
                    if (c == '(') {
                        stack.push(c);
                    } else if (c == ')') {
                        if (stack.isEmpty()) {
                            message = "NO";
                            break;
                        } else {
                            stack.pop();
                        }
                    }
                }
                if (!stack.isEmpty()) {
                    message = "NO";
                }
                sb.append(message)
                        .append(System.lineSeparator());

            }
            System.out.println(sb.toString().trim());
        }

    }
}
