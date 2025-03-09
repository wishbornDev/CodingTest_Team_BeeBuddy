package s00_null_c02_13_boj10989;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int len = Integer.parseInt(br.readLine());
            int[] numbers = new int[len];
            for (int i = 0; i < len; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(numbers);
            StringBuilder sb = new StringBuilder();
            for (int number : numbers) {
                sb.append(number)
                        .append(System.lineSeparator());
            }
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
                bw.write(sb.toString().trim());
            }

        }
    }
}
