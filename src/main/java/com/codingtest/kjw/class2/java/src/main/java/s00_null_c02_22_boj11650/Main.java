package s00_null_c02_22_boj11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int numPoints = Integer.parseInt(br.readLine());
            int[][] points = new int[numPoints][2];
            for (int i = 0; i < numPoints; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                points[i][0] = Integer.parseInt(st.nextToken());
                points[i][1] = Integer.parseInt(st.nextToken());
            }

            StringBuilder sb = new StringBuilder();

            Arrays.stream(points)
                    .sorted(Comparator.comparingInt((int[] x) -> x[0])
                            .thenComparingInt((int[] x) -> x[1]))
                    .forEach(x -> sb.append(x[0]).append(" ").append(x[1]).append(System.lineSeparator()));

            System.out.println(sb.toString().trim());

        }
    }
}
