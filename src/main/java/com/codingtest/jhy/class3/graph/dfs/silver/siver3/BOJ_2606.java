package main.java.com.codingtest.jhy.class3.graph.dfs.silver.siver3;

import java.io.*;
import java.util.*;

public class BOJ_2606 {

    private static int computer;
    private static int edge;
    private static int[][] graph;
    private static boolean[] visited;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        computer = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        graph = new int[computer + 1][computer + 1];
        visited = new boolean[computer + 1];

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());

            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            graph[c1][c2] = graph[c2][c1] = 1;
        }

        dfs(1);

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    private static void dfs(int node) {
        visited[node] = true;

        for (int i = 1; i <= computer; i++) {
            if (!visited[i] && graph[node][i] == 1) {
                count++;
                dfs(i);
            }
        }
    }

}