package main.java.com.codingtest;

import java.util.Scanner;

public class BOJ_10869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((a- a%b) / b);
        System.out.println(a%b);

        sc.close();
    }
}
