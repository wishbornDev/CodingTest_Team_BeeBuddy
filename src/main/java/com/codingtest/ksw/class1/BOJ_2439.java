package main.java.com.codingtest.ksw.class1;
import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args) {
        // 별 거꾸로 찍기

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n; j++) {
                if(j < n-i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
