package main.java.com.codingtest.oyk.class1;

import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "*";

        for(int i = 0; i < N; i++) {
            for(int j = 1; j < N-i; j++) {
                System.out.print(' ');
            }
            for(int j = N-i; j <= N; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
