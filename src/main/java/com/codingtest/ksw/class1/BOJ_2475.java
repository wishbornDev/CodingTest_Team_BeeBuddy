package src.main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_2475 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++){
            int temp = sc.nextInt();
            sum += temp * temp;
        }
        int result = sum % 10;
        System.out.println(result);

    }
}
