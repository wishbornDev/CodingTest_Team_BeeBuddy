package main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_2577 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String str = Integer.toString(num);

        for(int i = 0; i < 10; i++ ) {
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if((str.charAt(j)-'0') == i) {
                    count ++;
                }
            }

            System.out.println(count);
        }


    }

}


