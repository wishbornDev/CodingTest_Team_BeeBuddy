package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String num = sc.next();
        for(int i = 0; i < num.length(); i++){
            result += Integer.parseInt("" + num.charAt(i));
        }
        System.out.println(result);
    }
}
