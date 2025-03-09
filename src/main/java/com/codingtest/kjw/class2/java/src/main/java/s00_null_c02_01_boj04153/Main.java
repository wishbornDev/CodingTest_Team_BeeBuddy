package s00_null_c02_01_boj04153;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input;
        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] tokens = input.split(" ");
            int[] numbers = Arrays.stream(tokens)
                    .map(Integer::parseInt)
                    .mapToInt(x -> x)
                    .sorted()
                    .toArray();
            boolean isRightTriangle = isRightTriangle(numbers);
            sb.append(message(isRightTriangle))
                    .append(System.lineSeparator());
        }
        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isRightTriangle(int[] numbers) {
        return numbers[2] * numbers[2] == numbers[0] * numbers[0] + numbers[1] * numbers[1];
    }

    private static String message(boolean bool) {
        if (bool) {
            return "right";
        }
        return "wrong";
    }
}
