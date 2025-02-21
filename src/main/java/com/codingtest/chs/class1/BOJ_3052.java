package main.java.com.codingtest.chs.class1;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();

        while(sc.hasNextInt()){
            hashSet.add(sc.nextInt() % 42);
        }
        System.out.println(hashSet.size());
    }
}
