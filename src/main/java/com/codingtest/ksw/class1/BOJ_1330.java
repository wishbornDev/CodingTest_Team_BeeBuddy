package main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println('>');
        } else if (a < b) {
            System.out.println('<');
        } else if (a == b) {
            System.out.println("==");
        }
    }
}
