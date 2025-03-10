package main.java.com.codingtest.chs.class1;

import java.util.Scanner;

public class BOJ_2577 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; // count 수를 위한 배열
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num = a * b * c;
        String strNum = "" + num;

        for(int i = 0; i < strNum.length(); i++){
            int idx = strNum.charAt(i) - '0';
            arr[idx] +=1;
        }

        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }
}
