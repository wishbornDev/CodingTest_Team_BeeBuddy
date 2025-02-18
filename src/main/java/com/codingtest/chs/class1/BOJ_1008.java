package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = (double) a / b;

        System.out.println(result);

        sc.close();
    }
}
