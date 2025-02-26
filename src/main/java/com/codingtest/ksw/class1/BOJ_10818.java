package src.main.java.com.codingtest.ksw.class1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int[] arr = new int[index];

        for(int i = 0; i < index; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0] +" " + arr[index-1]);


    }

}