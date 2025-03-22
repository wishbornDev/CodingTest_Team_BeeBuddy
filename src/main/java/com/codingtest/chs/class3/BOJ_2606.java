package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2606 {
    static int[][] computers;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int size = Integer.parseInt(br.readLine());
        computers = new int[size+1][size+1];
        visited = new boolean[size + 1];
        int lineNums = Integer.parseInt(br.readLine());

        // 노드 값 입력
        while(lineNums-- > 0){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            computers[start][end] = computers[end][start] = 1;
        }

        System.out.println(virus());
    }

    private static int virus(){
        Queue<Integer> q = new LinkedList<>();
        int result = 0;
        q.offer(1);
        visited[1] = true;

        // 큐가 비지 않은 동안 반복
        while(!q.isEmpty()){
            int start = q.poll();
            visited[start] = true;
            for(int i = 1; i < computers[start].length; i++){
                // 연결된 경우 + 방문하지 않은 경우
                if(computers[start][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.offer(i);
                    result +=1;
                }
            }
        }
        return result;
    }
}
