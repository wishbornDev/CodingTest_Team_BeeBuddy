package main.java.com.codingtest.jhy.class3.graph.dfs.gold.gold5;

import java.io.*;

public class BOJ_10026 {

    private static int n, normalRegionCount, colorblindRegionCount;
    private static char[][] rgb;
    private static boolean[][] visited;

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        rgb = new char[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            for (int j = 0; j < n; j++) {
                rgb[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    rgbDfs(i, j, rgb[i][j]);
                    normalRegionCount++;
                }
                if (rgb[i][j] == 'G') {
                    rgb[i][j] = 'R';
                }
            }
        }

        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    rgbDfs(i, j, rgb[i][j]);
                    colorblindRegionCount++;
                }
            }
        }

        bw.write(normalRegionCount + " " + colorblindRegionCount);
        bw.flush();
        bw.close();
    }

    private static void rgbDfs(int x, int y, char color) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx < 0 || cy < 0 || cx >= n || cy >= n) {
                continue;
            }

            if (!visited[cx][cy] && rgb[cx][cy] == color) {
                rgbDfs(cx, cy, color);
            }
        }
    }

}