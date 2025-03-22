package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minPaint = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                minPaint = Math.min(minPaint, repaintCount(board, i, j));
            }
        }

        System.out.println(minPaint);
    }

    private static int repaintCount(char[][] board, int startX, int startY) {
        int countWStart = 0;
        int countBStart = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char caseW = ((i + j) % 2 == 0) ? 'W' : 'B';
                char caseB = ((i + j) % 2 == 0) ? 'B' : 'W';

                if (board[startX + i][startY + j] != caseW) countWStart++;
                if (board[startX + i][startY + j] != caseB) countBStart++;
            }
        }

        return Math.min(countWStart, countBStart);
    }
}
