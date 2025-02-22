package src.main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_10250 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스

        for(int i =0; i < t; i++) {

            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            if(n % h == 0) {
                System.out.println((h*100) + (n/h));
            }else {
                System.out.println(((n%h)*100)+((n/h)+1));
            }
        }
    }

}
