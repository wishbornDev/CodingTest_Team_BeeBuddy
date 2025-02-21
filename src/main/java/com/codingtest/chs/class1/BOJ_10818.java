package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int maxNum = -1000000;
        int minNum = +10000000;
        while(testCase-- > 0){
            int num = sc.nextInt();
            maxNum = Math.max(num, maxNum);
            minNum = Math.min(num, minNum);
        }
        System.out.println(minNum + " " + maxNum);
    }
}
