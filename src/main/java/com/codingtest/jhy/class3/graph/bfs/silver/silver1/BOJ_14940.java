package main.java.com.codingtest.jhy.class3.graph.bfs.silver.silver1;

import java.io.*;
import java.util.*;

public class BOJ_14940 {

    private static int n, m;
    private static int[][] graph;
    private static int[][] result;
    private static boolean[][] visited;

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        result = new int[n][m];
        visited = new boolean[n][m];

        int startX = 0;
        int startY = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());

                if (graph[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = -1;
                }
            }
        }

        bfs(startX, startY);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void bfs(int x, int y) {
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(x, y, 0));
        result[x][y] = 0;
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Position position = queue.poll();

            for (int i = 0; i < 4; i++) {
                int cx = position.x + dx[i];
                int cy = position.y + dy[i];

                if (cx < 0 || cy < 0 || cx >= n || cy >= m) {
                    continue;
                }

                if (!visited[cx][cy]) {
                    visited[cx][cy] = true;

                    if (graph[cx][cy] == 1) {
                        result[cx][cy] = position.distance + 1;
                        queue.offer(new Position(cx, cy, position.distance + 1));
                    }
                }
            }
        }
    }

    private static class Position {
        private int x;
        private int y;
        private int distance;

        public Position(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

}