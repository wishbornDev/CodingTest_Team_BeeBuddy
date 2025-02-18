package src.main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_2438 {
    public static void main(String[] args) {
        // 별찍기

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 0 ; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
