package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1012 {
    static int[][] farm;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        while(testCase-- > 0){
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            farm = new int[N][M];
            int veg = Integer.parseInt(st.nextToken());    // 배추 개수
            // 배추 채우기
            while(veg-- > 0){
                st = new StringTokenizer(br.readLine());
                int col = Integer.parseInt(st.nextToken());
                int row = Integer.parseInt(st.nextToken());
                farm[row][col] = 1;
            }
            sb.append(worming()).append("\n");
        }
        System.out.println(sb);
    }

    private static int worming(){
        int count = 0;
        for(int i = 0; i < farm.length; i++){
            for(int j = 0; j < farm[i].length; j++){
                if(farm[i][j] == 1){
                    farm[i][j] = -1;
                    dfs(i, j);
                    count +=1;
                }
            }
        }
        return count;
    }

    private static void dfs(int x, int y){
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(rangeCheck(nx, ny) && farm[nx][ny] == 1){
                farm[nx][ny] = -1;
                dfs(nx, ny);
            }
        }
    }

    private static boolean rangeCheck(int x, int y){
        return x >= 0 && x < farm.length && y >= 0 && y < farm[0].length;
    }
}
