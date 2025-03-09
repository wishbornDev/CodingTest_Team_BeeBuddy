package s00_null_c02_40_boj01874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int len = Integer.parseInt(br.readLine());
            final int[] sequence = new int[len];
            for (int i = 0; i < len; i++) {
                sequence[i] = Integer.parseInt(br.readLine());
            }

            StringBuilder sb = new StringBuilder();
            int number = 1;
            Stack<Integer> stack = new Stack<>();
            while (number <= len || !stack.isEmpty()) {
                for (int term : sequence) {
                    int firstOut = stack.isEmpty() ? 0 : stack.peek();
                    while (term > firstOut) {
                        stack.push(number);
                        sb.append("+").append(System.lineSeparator());
                        firstOut = stack.peek();
                        number += 1;
                    }
                    if (term == firstOut) {
                        stack.pop();
                        sb.append("-").append(System.lineSeparator());
                        continue;
                    }
                    if (term < firstOut) {
                        System.out.println("NO");
                        return;
                    }

                }

            }
            System.out.println(sb.toString().trim());
        }
    }
}
