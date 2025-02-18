package src.main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_2739 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i<10; i++ ) {
            System.out.println(num + " * " + i +" = " + (num*i));
        }

    }

}

