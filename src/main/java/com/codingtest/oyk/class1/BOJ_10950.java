package main.java.com.codingtest.oyk.class1;

import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();
        int[] arr = new int[T];
        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 향상 for문
//        for (int j : arr) {
//            System.out.println(j);
//        }

    }
}
