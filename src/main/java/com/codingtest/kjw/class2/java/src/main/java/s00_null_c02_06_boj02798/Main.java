package s00_null_c02_06_boj02798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        String input;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            input = br.readLine();

            StringTokenizer st = new StringTokenizer(input);
            final int number = Integer.parseInt(st.nextToken());
            final int threshold = Integer.parseInt(st.nextToken());

            input = br.readLine();
            st = new StringTokenizer(input);
            int[] cards = new int[number];
            for (int i = 0; i < number; i++) {
                cards[i] = Integer.parseInt(st.nextToken());
            }

            int possibleMax = 0;
            for (int i = 0; i < number - 2; i++) {
                for (int j = i + 1; j < number - 1; j++) {
                    for (int k = j + 1; k < number; k++) {
                        int sum = cards[i] + cards[j] + cards[k];
                        if (sum <= threshold) {
                            possibleMax = Math.max(possibleMax, sum);
                        }
                    }
                }
            }
            System.out.println(possibleMax);

        }

    }


}
