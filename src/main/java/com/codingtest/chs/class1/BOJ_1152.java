package main.java.com.codingtest.chs.class1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringTokenizer token = new StringTokenizer(sc.nextLine());
        int count = token.countTokens();
        System.out.println(count);
    }
}
