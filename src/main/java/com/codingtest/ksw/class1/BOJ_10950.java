package main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_10950 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();

        int arr[] = new int[index];

        for(int i = 0; i< index; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }

        for(int j : arr) {
            System.out.println(j);
        }

    }

}
