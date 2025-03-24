package main.java.com.codingtest.jhy.class3.graph.bfs.gold.gold5;

import java.io.*;
import java.util.*;

public class BOJ_7576 {

    private static int n, m, minDay;
    private static int[][] graph;
    private static boolean[][] visited;
    private static Queue<Position> queue;

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];
        queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());

                if (graph[i][j] == 1) {
                    queue.offer(new Position(i, j, 0));
                }
            }
        }

        bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0) {
                    minDay = -1;
                    break;
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

            for (int j = 0; j < 4; j++) {
                int cx = position.x + dx[j];
                int cy = position.y + dy[j];

                if (cx < 0 || cy < 0 || cx >= n || cy >= m || graph[cx][cy] == -1) {
                    continue;
                }

                if (!visited[cx][cy] && graph[cx][cy] == 0) {
                    visited[cx][cy] = true;
                    graph[cx][cy] = 1;
                    queue.offer(new Position(cx, cy, position.day + 1));
                }
            }

            if (queue.isEmpty()) {
                minDay = position.day;
                return;
            }
        }
    }

    private static class Position {
        private int x;
        private int y;
        private int day;

        public Position(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

}