package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 첫 숫자 버리기
        sc.nextInt();

        int a;
        int b;

        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }

        sc.close();
    }
}
