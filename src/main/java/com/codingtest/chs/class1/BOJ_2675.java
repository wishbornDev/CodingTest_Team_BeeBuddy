package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_2675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase-- > 0){
            int repeatNum = sc.nextInt();
            String[] arr = sc.next().split("");
            for(String str: arr){
                System.out.print(str.repeat(repeatNum));
            }
            System.out.println();
        }
    }
}
