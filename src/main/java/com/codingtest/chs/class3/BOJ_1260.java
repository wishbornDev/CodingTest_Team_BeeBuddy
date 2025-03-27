package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
    static int[][] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];

        // 그래프 그려주기
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph[start][end] = graph[end][start] = 1;
        }
        visited = new boolean[graph.length];
        visited[V] = true;
        sb.append(V).append(" ");
        dfs(V);

        visited = new boolean[graph.length];
        visited[V] = true;
        sb.append("\n").append(V).append(" ");
        bfs(V);

        System.out.println(sb);
    }

    private static void dfs(int start){
        for(int i = 1; i < graph[start].length; i++){
            if(graph[start][i] == 1 && !visited[i]){
                visited[i] = true;
                sb.append(i).append(" ");
                dfs(i);
            }
        }
    }

    private static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while(!q.isEmpty()){
            int num = q.poll();
            for(int i = 1; i < graph[num].length; i++){
                if(graph[num][i] == 1 && !visited[i]){
                    visited[i] = true;
                    sb.append(i).append(" ");
                    q.offer(i);
                }
            }
        }
    }
}
