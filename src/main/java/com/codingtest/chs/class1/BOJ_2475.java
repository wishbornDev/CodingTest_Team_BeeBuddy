package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_2475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sumOfPow = 0;

        while(sc.hasNextInt()){
            int num = sc.nextInt();
            sumOfPow += (int) Math.pow(num,2);
        }

        System.out.println(sumOfPow%10);

        sc.close();
    }
}
