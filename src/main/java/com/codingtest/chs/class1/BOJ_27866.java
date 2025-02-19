package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_27866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int idx = sc.nextInt() - 1;

        System.out.println(str.charAt(idx));
    }
}
