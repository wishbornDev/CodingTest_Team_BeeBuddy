package main.java.com.codingtest.jhy.class3.graph.bfs.gold.gold5;

import java.io.*;
import java.util.*;

public class BOJ_16928 {

    private static int minCount;
    private static int[] ladderSnake;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ladderSnake = new int[101];
        visited = new boolean[101];

        for (int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            ladderSnake[u] = v;
        }

        bfs();

        bw.write(String.valueOf(minCount));
        bw.flush();
        bw.close();
    }

    private static void bfs() {
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(1, 0));
        visited[1] = true;

        while (!queue.isEmpty()) {
            Position position = queue.poll();

            if (position.current == 100) {
                minCount = position.count;
                return;
            }

            for (int i = 1; i <= 6; i++) {
                int nextPosition = position.current + i;

                if (nextPosition > 100) {
                    continue;
                }

                if (!visited[nextPosition]) {
                    visited[nextPosition] = true;

                    if (ladderSnake[nextPosition] != 0) {
                        queue.offer(new Position(ladderSnake[nextPosition], position.count + 1));
                    } else {
                        queue.offer(new Position(nextPosition, position.count + 1));
                    }
                }
            }
        }
    }

    private static class Position {
        private int current;
        private int count;

        public Position(int current, int count) {
            this.current = current;
            this.count = count;
        }
    }

}