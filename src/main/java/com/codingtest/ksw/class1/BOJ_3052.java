package main.java.com.codingtest.ksw.class1;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_3052 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int count = 0;
        String mod[] = new String[10];
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            mod[i] = Integer.toString(arr[i] % 42);
        }

        for(String remain : mod) {
            if(!list.contains(remain)) {
                list.add(remain);
            }
        }
        System.out.println(list.size());
    }

}

