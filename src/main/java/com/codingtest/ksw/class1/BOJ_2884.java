package src.main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_2884 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt(); // 시
        int min = sc.nextInt(); // 분

        if(min < 45) {
            hour --;
            min = 60 - (45 - min);
            if(hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + min);

        } else {
            System.out.println(hour + " " + (min-45));
        }
    }

}
