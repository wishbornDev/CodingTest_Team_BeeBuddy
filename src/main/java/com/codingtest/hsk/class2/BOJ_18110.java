package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_18110 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int num = (int) Math.round(n*0.15);
        int[] arr = new int[n];
        int difficulty = 0;

        if (n==0) {
            System.out.println(0);
            return;
        }
        for (int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        for (int i=num; i<n-num; i++) {
            difficulty += arr[i];
        }

        System.out.println(Math.round((double)difficulty/(n-2*num)));
    }
}
