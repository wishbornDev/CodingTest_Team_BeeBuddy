package main.java.com.codingtest.jhy.class3.graph.dfs.silver.silver1;

import java.io.*;
import java.util.*;

public class BOJ_2667 {

    private static int n, count;
    private static int[][] graph;
    private static boolean[][] visited;
    private static List<Integer> list;

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        visited = new boolean[n][n];
        list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            for (int j = 0; j < n; j++) {
                graph[i][j] = input.charAt(j) - '0';
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    count = 1;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }

        Collections.sort(list);

        sb.append(list.size()).append("\n");
        for (int value : list) {
            sb.append(value).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx < 0 || cy < 0 || cx >= n || cy >= n) {
                continue;
            }

            if (!visited[cx][cy] && graph[cx][cy] == 1) {
                count++;
                dfs(cx, cy);
            }
        }
    }

}