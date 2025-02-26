package src.main.java.com.codingtest.ksw.class1;

import java.util.Scanner;

public class BOJ_10809 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] arr = new int[26]; // 문자의 위치

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for(int i = 0; i <s.length(); i ++) {
            char ch = s.charAt(i);

            if(arr[ch -'a'] == -1) { // arr 의 원소값이 -1 일 때만 초기화 ( 해당 알파벳의 첫 위치만 받기 위해 )
                arr[ch-'a'] = i;
            }
        }

        for(int site : arr) {
            System.out.print(site +" ");
        }

    }

}
