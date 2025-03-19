package main.java.com.codingtest.jhy.class3.graph.bfs.silver.silver1;

import java.io.*;
import java.util.*;

public class BOJ_2178 {

    private static int n, m;
    private static int min;
    private static int[][] graph;
    private static boolean[][] visited;

    private static int[] dx = {1, 0, 0, -1};
    private static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            for (int j = 0; j < input.length(); j++) {
                graph[i][j] = input.charAt(j) - '0';
            }
        }

        bfs();

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }

    private static void bfs() {
        Queue<Maze> queue = new LinkedList<>();
        queue.offer(new Maze(0, 0, 1));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Maze maze = queue.poll();

            if (maze.x == n - 1 && maze.y == m - 1) {
                min = maze.count;
                return;
            }

            for (int i = 0; i < 4; i++) {
                int cx = maze.x + dx[i];
                int cy = maze.y + dy[i];

                if (cx < 0 || cy < 0 || cx >= n || cy >= m) {
                    continue;
                }
                if (!visited[cx][cy] && graph[cx][cy] == 1) {
                    visited[cx][cy] = true;
                    queue.offer(new Maze(cx, cy, maze.count + 1));
                }
            }
        }
    }

    private static class Maze {
        private int x;
        private int y;
        private int count;

        public Maze(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

}