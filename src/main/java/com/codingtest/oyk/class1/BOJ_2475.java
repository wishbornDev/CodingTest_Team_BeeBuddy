package main.java.com.codingtest.oyk.class1;

import java.util.Scanner;

public class BOJ_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            int temp = 0;
            temp = (n*n);
            sum += temp;
        }
        result = sum % 10;
        System.out.println(result);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();
//
//        int result = (a*a + b*b + c*c + d*d + e*e) % 10;
//
//        System.out.println(result);

    }
}
