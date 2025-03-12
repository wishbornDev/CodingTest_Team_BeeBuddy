package main.java.com.codingtest.oyk.class1;

import java.util.Scanner;

public class BOJ_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result;

        if(n >= 1 && n <= 9) {
            for(int i = 1; i <= 9; i++) {
                result = n * i;
                System.out.println(n + " * " + i + " = " + result);
            }
        }
    }
}
