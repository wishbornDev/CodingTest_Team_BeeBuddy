package s00_null_c02_09_boj01546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] scores = new int[number];
            for (int i = 0; i < number; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
            }
            int max = Arrays.stream(scores).max().orElse(0); // optionalInt에서 만약 null이면 0 반환
            int sum = Arrays.stream(scores).sum();
            System.out.println((double) sum / number * 100 / max);
        }
    }
}
