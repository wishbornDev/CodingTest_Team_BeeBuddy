package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(" ".repeat(num - i) + "*".repeat(i));
        }
    }
}
