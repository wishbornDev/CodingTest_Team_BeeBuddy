package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int length = Integer.parseInt(br.readLine());
        int[][] coordArr = new int[length][2];

        for(int i = 0; i < length; i ++){
            st = new StringTokenizer(br.readLine());
            coordArr[i][0] = Integer.parseInt(st.nextToken());
            coordArr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(coordArr,((a, b) -> {
            if(a[1] == b[1]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        }));

        for(int[] coord : coordArr){
            sb.append(coord[0]).append(" ").append(coord[1]).append("\n");
        }
        System.out.println(sb);
    }
}
