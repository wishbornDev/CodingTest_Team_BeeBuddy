package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class BOJ_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[][] people = new int[num][2];
        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine());
            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int[] person : people) {
            int rank = 1;
            for (int[] targetPerson : people) {
                if (targetPerson[0] > person[0] && targetPerson[1] > person[1]) {
                    rank += 1;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}
