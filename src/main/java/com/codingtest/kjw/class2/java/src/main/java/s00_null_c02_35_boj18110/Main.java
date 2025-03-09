package s00_null_c02_35_boj18110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static final int TRUNCATE = 15;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int numScores = Integer.parseInt(br.readLine());
            int[] scores = new int[numScores];
            double truncatedAvg = 0;
            for (int i = 0; i < numScores; i++) {
                scores[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(scores);
            int numTruncate = (int) Math.round((double) TRUNCATE * numScores / 100);

            truncatedAvg = (double) Arrays.stream(Arrays.copyOfRange(scores, numTruncate, numScores - numTruncate)).sum() / (numScores - 2 * numTruncate);
            System.out.println((int) Math.round(truncatedAvg));
        }
    }
}
