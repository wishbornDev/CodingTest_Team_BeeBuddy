package s00_null_c02_24_boj01018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final String line1 = "BW".repeat(4);
    static final String line2 = "WB".repeat(4);

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            final int rowCount = Integer.parseInt(st.nextToken());
            final int colCount = Integer.parseInt(st.nextToken());
            String[] board = new String[rowCount];
            for (int i = 0; i < rowCount; i++) {
                board[i] = br.readLine();
            }

            int recolor1 = rowCount * colCount;
            int recolor2 = rowCount * colCount;

            for (int i = 0; i <= rowCount - 8; i++) {
                for (int j = 0; j <= colCount - 8; j++) {
                    int tmp = recolor(board, i, j, getBoard1());
                    int tmp2 = recolor(board, i, j, getBoard2());
                    recolor1 = Math.min(recolor1, tmp);
                    recolor2 = Math.min(recolor2, tmp2);
                }
            }

            System.out.println(Math.min(recolor1, recolor2));

        }
    }

    private static int recolor(String[] board, int row, int col, String[] correctBoard) {
        String[] partialBoard = new String[8];
        int count = 0;

        for (int i = 0; i < 8; i++) {
            partialBoard[i] = board[row + i].substring(col, col + 8);
            for (int j = 0; j < 8; j++) {
                if (partialBoard[i].charAt(j) != correctBoard[i].charAt(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    private static String[] getBoard1() {
        String[] board = new String[8];
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                board[i] = line1;
            } else {
                board[i] = line2;
            }
        }
        return board;
    }

    private static String[] getBoard2() {
        String[] board = new String[8];
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                board[i] = line2;
            } else {
                board[i] = line1;
            }
        }
        return board;
    }
}
