package main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_9498 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        if(num >= 90) {
            System.out.println('A');
        }else if(num >= 80) {
            System.out.println('B');
        }else if(num >= 70) {
            System.out.println('C');
        }else if(num >= 60) {
            System.out.println('D');
        }else {
            System.out.println('F');
        }

    }
}
