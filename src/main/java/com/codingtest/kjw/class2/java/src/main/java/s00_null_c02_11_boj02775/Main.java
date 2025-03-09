package s00_null_c02_11_boj02775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 8ms 개선 성공
    static final int MAX_FLOOR = 14;
    static final int MAX_ROOM = 14;

    public static void main(String[] args) throws IOException {
        int[][] counts = new int[MAX_FLOOR + 1][MAX_ROOM + 1];
        for (int k = 1; k <= MAX_ROOM; k++) {
            counts[0][k] = k;
        }
        for (int j = 1; j <= MAX_FLOOR; j++) {
            for (int k = 1; k <= MAX_ROOM; k++) {
                counts[j][k] = counts[j - 1][k] + counts[j][k - 1];
            }
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int numTests = Integer.parseInt(br.readLine());
            for (int i = 0; i < numTests; i++) {
                final int floor = Integer.parseInt(br.readLine());
                final int room = Integer.parseInt(br.readLine());
                System.out.println(counts[floor][room]);
            }

        }

    }
}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            final int numTests = Integer.parseInt(br.readLine());
//            for (int i = 0; i < numTests; i++) {
//                final int floor = Integer.parseInt(br.readLine());
//                final int room = Integer.parseInt(br.readLine());
//                int[][] counts = new int[floor + 1][room + 1];
//                for (int k = 1; k <= room; k++) {
//                    counts[0][k] = k;
//                }
//                for (int j = 1; j <= floor; j++) {
//                    for (int k = 1; k <= room; k++) {
//                        counts[j][k] = counts[j - 1][k] + counts[j][k - 1];
//                    }
//                }
//                System.out.println(counts[floor][room]);
//            }
//
//        }
//
//    }
//}
