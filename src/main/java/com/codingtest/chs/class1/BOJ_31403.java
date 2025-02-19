package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_31403 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result1 = a + b - c;
        int result2 = Integer.parseInt("" + a + b) - c;
        System.out.println(result1);
        System.out.println(result2);
    }
}
