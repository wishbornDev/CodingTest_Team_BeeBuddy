package s00_null_c02_39_boj01654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            final int countCurrentCables = Integer.parseInt(st.nextToken());
            final int requiredCables = Integer.parseInt(st.nextToken());

            int[] cables = new int[countCurrentCables];
            for (int i = 0; i < countCurrentCables; i++) {
                cables[i] = Integer.parseInt(br.readLine());
            }

            long left = 1; // 오버플로우 유의!
            long right = Arrays.stream(cables).max().orElse(1);
            long result = 1;

            while (left <= right) {
                long mid = (left + right) / 2;
                long count = Arrays.stream(cables)
                        .mapToLong(x -> x / mid)
                        .sum();
                if (count >= requiredCables) { // 부등호 유의
                    result = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(result);
        }
    }
}
