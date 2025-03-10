package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int x = 0; x <= N - 8; x++) {
            for (int y = 0; y <= M - 8; y++) {
                min = Math.min(min, repaintCount(board, x, y));
            }
        }

        System.out.println(min);
    }

    private static int repaintCount(char[][] board, int x, int y) {
        int count1 = 0;
        int count2 = 0;

        char[][] patterns = {
                {'W', 'B'},
                {'B', 'W'}
        };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expected1 = patterns[(i + j) % 2][0]; // 패턴 1과 비교
                char expected2 = patterns[(i + j) % 2][1]; // 패턴 2와 비교

                if (board[x + i][y + j] != expected1) count1++;
                if (board[x + i][y + j] != expected2) count2++;
            }
        }

        return Math.min(count1, count2);
    }
}
