package main.java.com.codingtest.jhy.class3.graph.bfs.silver.silver2;

import java.io.*;
import java.util.*;

public class BOJ_1012 {

    private static int m, n, k;
    private static int[][] graph;
    private static boolean[][] visited;

    private static int[] dx = {1, 0, 0, -1};
    private static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            graph = new int[m][n];
            visited = new boolean[m][n];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
            }

            int count = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && graph[i][j] == 1) {
                        bfs(i, j);
                        count++;
                    }
                }
            }

            sb.append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void bfs(int x, int y) {
        Queue<Farm> queue = new LinkedList<>();
        queue.add(new Farm(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Farm farm = queue.poll();

            for (int i = 0; i < 4; i++) {
                int cx = farm.x + dx[i];
                int cy = farm.y + dy[i];

                if (cx < 0 || cy < 0 || cx >= m || cy >= n) {
                    continue;
                }
                if (!visited[cx][cy] && graph[cx][cy] == 1) {
                    visited[cx][cy] = true;
                    queue.add(new Farm(cx, cy));
                }
            }
        }
    }

    private static class Farm {
        private final int x;
        private final int y;

        public Farm(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}