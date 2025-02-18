package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_2438 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String str = "";
        for(int i = 1;i <= count; i++){
            str += '*';
            System.out.println(str);
        }

        sc.close();
    }
}
