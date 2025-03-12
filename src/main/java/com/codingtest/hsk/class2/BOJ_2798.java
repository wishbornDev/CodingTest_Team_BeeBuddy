package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2798 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[] cardList = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) cardList[i] = Integer.parseInt(st2.nextToken());

        Arrays.sort(cardList);

        int maxSum = 0;

        for (int i=0; i<N; i++) {
            int left = i+1;
            int right = N-1;
            while (left < right) {
                int sum = cardList[i] + cardList[left] + cardList[right];
                if (sum<=M) {
                    maxSum = Math.max(maxSum, sum);
                    left++;
                } else right--;
            }
        }
        System.out.println(maxSum);
    }
}
