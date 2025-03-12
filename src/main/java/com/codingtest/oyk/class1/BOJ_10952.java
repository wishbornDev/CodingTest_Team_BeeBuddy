package main.java.com.codingtest.oyk.class1;

import java.util.Scanner;

public class BOJ_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if( A == 0 && B == 0) break;

            System.out.println(A + B);

        }
    }
}
