package main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_2675 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) { // 새로운 문자열을 만들 횟수

            int r = sc.nextInt(); // 문자열의 문자를 반복할 횟수
            String s = sc.next(); // 문자열 받기

            for(int j = 0; j < s.length(); j++) { // 문자열의 길이만큼 반복하면서
                for(int k = 0; k < r; k++) { // r 만큼 문자를 반복해서
                    System.out.print(s.charAt(j)); // 새로운 문자열로 출력
                }
            }
            System.out.println(); // 케이스 마다 한 칸 띄우기
        }

    }

}

