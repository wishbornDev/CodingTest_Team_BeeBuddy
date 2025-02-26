package src.main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_10952 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b;

        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 &&  b== 0) {
                break;
            }
            System.out.println(a+b);
        }
    }
}
