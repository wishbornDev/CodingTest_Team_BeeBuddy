package main.java.com.codingtest.jhy.class2.bruteforce.silver.silver4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1018 {

    // 개선된 코드 - 메모리 14308 KB, 속도 : 108 ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] chessboard = new char[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            for (int j = 0; j < m; j++) {
                chessboard[i][j] = input.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                min = Math.min(min, calculateMinRepaints(chessboard, i, j));
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }

    private static int calculateMinRepaints(char[][] chess, int x, int y) {
        int repaintsForBlackStart = 0;
        int repaintsForWhiteStart = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0){
                    if (chess[i][j] == 'B')  {
                        repaintsForWhiteStart++;
                    } else {
                        repaintsForBlackStart++;
                    }
                } else {
                    if (chess[i][j] == 'W') {
                        repaintsForWhiteStart++;
                    } else {
                        repaintsForBlackStart++;
                    }
                }
            }
        }
        return Math.min(repaintsForBlackStart, repaintsForWhiteStart);
    }

/*
    처음 푼 코드 - 메모리 : 15768 KB, 속도 : 124 ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] chessboard = new char[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                chessboard[i][j] = input.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                min = Math.min(min, changeColorCount(chessboard, i, j));
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }

    private static int changeColorCount(char[][] chessboard, int x, int y) {
        int repaintCountForBlackStart = calculateRepaintCountForBlackStart(chessboard, x, y);
        int repaintCountForWhiteStart = calculateRepaintCountForWhiteStart(chessboard, x, y);

        return Math.min(repaintCountForWhiteStart, repaintCountForBlackStart);
    }

    private static int calculateRepaintCountForBlackStart(char[][] chessboard, int x, int y) {
        int count = 0;
        char[][] blackStartPattern = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                blackStartPattern[i][j] = (i + j) % 2 == 0 ? 'B' : 'W';
            }
        }
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (chessboard[i][j] != blackStartPattern[i - x][j - y]) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int calculateRepaintCountForWhiteStart(char[][] chessboard, int x, int y) {
        int count = 0;
        char[][] whiteStartPattern = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                whiteStartPattern[i][j] = (i + j) % 2 == 0 ? 'W' : 'B';
            }
        }
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (chessboard[i][j] != whiteStartPattern[i - x][j - y]) {
                    count++;
                }
            }
        }
        return count;
    }
*/

}