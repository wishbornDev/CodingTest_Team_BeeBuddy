package s00_null_c02_30_boj10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int numCount = Integer.parseInt(br.readLine());
            Stack<Integer> numbers = new Stack<>();
            for (int i = 0; i < numCount; i++) {
                int number = Integer.parseInt(br.readLine());
                if (number != 0) {
                    numbers.push(number);
                } else {
                    numbers.pop();
                }
            }
            int sum = 0;
            while (!numbers.isEmpty()) {
                sum += numbers.pop();
            }
            System.out.println(sum);
        }
    }
}
