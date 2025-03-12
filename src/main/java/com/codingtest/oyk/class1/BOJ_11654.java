package main.java.com.codingtest.oyk.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char ch = input.charAt(0);

        System.out.println((int) ch);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//
//        char ch = input.charAt(0);
//
//        System.out.println((int) ch);
//
//
//    }
}
