package s00_null_c02_02_boj30802;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int participants = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] tokens = input.split(" ");
        int[] requestOnSize = Arrays.stream(tokens)
                .mapToInt(Integer::parseInt)
                .toArray();

        tokens = br.readLine().split(" "); // tshirts, pen
        int[] bundles = Arrays.stream(tokens)
                .mapToInt(Integer::parseInt)
                .toArray();

        int tshirts = Arrays.stream(requestOnSize)
                .map(x -> getNumberOfTshirts(x, bundles[0]))
                .sum();

        int penBundle = participants / bundles[1];
        int penSeparate = participants % bundles[1];

        sb.append(tshirts).append(System.lineSeparator())
                .append(penBundle).append(" ").append(penSeparate);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int getNumberOfTshirts(int dividend, int divisor) {
        if (dividend != 0) {
            return (dividend - 1) / divisor + 1; // 파이썬과 나눗셈 작동 방식이 다름
        }
        return 0;
    }
}
