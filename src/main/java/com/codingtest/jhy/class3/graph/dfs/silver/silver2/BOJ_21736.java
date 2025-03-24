package main.java.com.codingtest.jhy.class3.graph.dfs.silver.silver2;

import java.io.*;
import java.util.*;

public class BOJ_21736 {

    private static int n, m, count;
    private static char[][] graph;
    private static boolean[][] visited;
    private static Queue<Campus> queue;

    private static int[] dx = {1, 0, 0, -1};
    private static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new char[n][m];
        visited = new boolean[n][m];
        queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            for (int j = 0; j < m; j++) {
                graph[i][j] = input.charAt(j);

                if (graph[i][j] == 'I') {
                    queue.offer(new Campus(i, j));
                    visited[i][j] = true;
                }
            }
        }

        bfs();

        bw.write(String.valueOf(count == 0 ? "TT" : count));
        bw.flush();
        bw.close();
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Campus campus = queue.poll();

            for (int i = 0; i < 4; i++) {
                int cx = campus.x + dx[i];
                int cy = campus.y + dy[i];

                if (cx < 0 || cy < 0 || cx >= n || cy >= m || graph[cx][cy] == 'X') {
                    continue;
                }
                if (!visited[cx][cy]) {
                    visited[cx][cy] = true;
                    if (graph[cx][cy] == 'P') {
                        count++;
                    }
                    queue.offer(new Campus(cx, cy));
                }
            }
        }
    }

    private static class Campus {
        private int x;
        private int y;

        public Campus(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}