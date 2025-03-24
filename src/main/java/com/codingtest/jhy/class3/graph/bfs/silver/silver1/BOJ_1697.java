package main.java.com.codingtest.jhy.class3.graph.bfs.silver.silver1;

import java.io.*;
import java.util.*;

public class BOJ_1697 {

    private static int n, k, result;
    private static boolean[] visited;

    private static int[] dx = {-1, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        visited = new boolean[200001];

        bfs(n);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static void bfs(int n) {
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(n, 0));
        visited[n] = true;

        while (!queue.isEmpty()) {
            Position position = queue.poll();

            if (position.x == k) {
                result = position.moveCount;
                return;
            }

            for (int i = 0; i < 3; i++) {
                int cx = i == 2 ? position.x * dx[i] : position.x + dx[i];

                if (cx < 0 || cx > 200000) {
                    continue;
                }

                if (!visited[cx]) {
                    visited[cx] = true;
                    queue.offer(new Position(cx, position.moveCount + 1));
                }
            }
        }
    }

    private static class Position {
        private int x;
        private int moveCount;

        public Position(int x, int moveCount) {
            this.x = x;
            this.moveCount = moveCount;
        }
    }

}