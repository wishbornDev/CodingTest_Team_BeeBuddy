package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt() - 45;
        // hour 바꿔야 하는 경우
        if(minute < 0){
            hour -=1;
            if(hour == -1){
                hour = 23;
            }
            minute = 60 + minute;
        }
        System.out.println(hour+" "+minute);
    }
}
