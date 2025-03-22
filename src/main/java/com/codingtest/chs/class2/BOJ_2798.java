package main.java.com.codingtest.chs.class2;

import java.util.*;
import java.io.*;

public class BOJ_2798 {
    /* 카드 합 출력*/
    private static int sum(int[] arr){
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        return sum;
    }

    private static int comb(int[] arr, boolean[] visited, int targetNum ,int sumOfCard, int start, int r){
        if(r == 0){
            return sumOfCard;
        }

        int answer = 0;

        for(int i = start; i < arr.length; i++){
            // 이미 방문한 경우 다음 요소 진행
            if(visited[i]){
                continue;
            }
            // 방문한 노드 방문 처리
            visited[i] = true;
            int recentSum = comb(arr, visited, targetNum,sumOfCard + arr[i], start +1, r - 1);
            // 블랙잭에 가까운 수인 경우
            if(targetNum - recentSum >= 0 && recentSum > answer){
                answer = recentSum;
            }
            visited[i] = false;
        }
        return answer;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardAmount = Integer.parseInt(st.nextToken());
        int targetNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] card = new int[cardAmount];
        boolean[] visited = new boolean[cardAmount];
        int answer = 0;

        for(int i = 0; i < card.length; i++){
            card[i] = Integer.parseInt(st.nextToken());
            visited[i] = false;
        }

        answer = comb(card, visited, targetNum, answer, 0, 3);
        System.out.println(answer);
    }
}
