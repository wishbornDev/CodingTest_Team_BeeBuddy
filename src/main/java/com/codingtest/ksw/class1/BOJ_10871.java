package main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int num = sc.nextInt();

        int array[] = new int[size];
        int small[] = new int[size];
        int index = 0;

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for(int j = 0; j < size; j++) {
            if(array[j] < num) {
                small[index] = array[j];
                index++;
            }
        }
        for(int k = 0; k < index; k++) {
            System.out.print(small[k] + " ");
        }
    }
}
