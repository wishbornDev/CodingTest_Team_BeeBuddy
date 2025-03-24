package main.java.com.codingtest.jhy.class3.graph.bfs.silver.silver1;

import java.io.*;
import java.util.*;

public class BOJ_1389 {

    private static int n;
    private static int[][] graph;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        int min = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            int count = bfs(i);

            if (min > count) {
                min = count;
                result = i;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static int bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;
        int count = 1;
        int returnValue = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                for (int j = 1; j <= n; j++) {
                    if (!visited[j] && graph[current][j] == 1) {
                        visited[j] = true;
                        returnValue += count;
                        queue.offer(j);
                    }
                }
            }
            count++;
        }

        return returnValue;
    }

}