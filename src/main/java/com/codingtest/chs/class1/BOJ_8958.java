package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase-- > 0){
            int score = 0; // 총 점수
            int point = 1; // 정답 시 획득 포인트
            char[] submitOX = sc.next().toCharArray();
            for(char ch : submitOX){
                if(ch == 'O'){
                    score += point++;
                }else{
                    point = 1;
                }
            }
            System.out.println(score);
        }
    }
}
