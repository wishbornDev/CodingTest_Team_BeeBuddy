package main.java.com.codingtest.jhy.class3.graph.dfs.silver.silver2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11724 {

    private static int n, count;
    private static int[][] graph;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = graph[v][u] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    private static void dfs(int node) {
        visited[node] = true;

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[node][i] == 1) {
                dfs(i);
            }
        }
    }

}