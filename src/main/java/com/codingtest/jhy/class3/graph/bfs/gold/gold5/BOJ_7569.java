package main.java.com.codingtest.jhy.class3.graph.bfs.gold.gold5;

import java.io.*;
import java.util.*;

public class BOJ_7569 {

    private static int m, n, h, minDay;
    private static int[][][] graph;
    private static boolean[][][] visited;
    private static Queue<Position> queue;

    private static int[] dx = {1, 0, -1, 0, 0, 0};
    private static int[] dy = {0, 1, 0, -1, 0, 0};
    private static int[] dh = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        graph = new int[n][m][h];
        visited = new boolean[n][m][h];
        queue = new LinkedList<>();

        for (int k = 0; k < h; k++) {
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                    graph[i][j][k] = Integer.parseInt(st.nextToken());

                    if (graph[i][j][k] == 1) {
                        queue.offer(new Position(i, j, k, 0));
                    }
                }
            }
        }

        bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int  k = 0; k < h; k++) {
                    if (graph[i][j][k] == 0) {
                        minDay = -1;
                        break;
                    }
                }
            }
        }

        bw.write(String.valueOf(minDay));
        bw.flush();
        bw.close();
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Position position = queue.poll();

            for (int i = 0; i < 6; i++) {
                int cx = position.x + dx[i];
                int cy = position.y + dy[i];
                int ch = position.h + dh[i];

                if (cx < 0 || cy < 0 || ch < 0 || cx >= n || cy >= m || ch >= h || graph[cx][cy][ch] == -1) {
                    continue;
                }

                if (!visited[cx][cy][ch] && graph[cx][cy][ch] == 0) {
                    visited[cx][cy][ch] = true;
                    graph[cx][cy][ch] = 1;
                    queue.offer(new Position(cx, cy, ch, position.day + 1));
                }
            }

            if (queue.isEmpty()) {
                minDay = position.day;
                break;
            }
        }
    }

    private static class Position {
        private int x;
        private int y;
        private int h;
        private int day;

        public Position(int x, int y, int h, int day) {
            this.x = x;
            this.y = y;
            this.h = h;
            this.day = day;
        }
    }

}