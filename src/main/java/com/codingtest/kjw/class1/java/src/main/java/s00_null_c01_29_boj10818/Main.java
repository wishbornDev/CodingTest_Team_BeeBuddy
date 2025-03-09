package s00_null_c01_29_boj10818;

import java.io.*;

public class Main {
    static final int MIN = -1_000_000;
    static final int MAX = 1_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        int min = MAX;
        int max = MIN;

        String[] numbers = br.readLine().split(" ");
        for (int i = 0; i < len; i++) {
            int number = Integer.parseInt(numbers[i]);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}
