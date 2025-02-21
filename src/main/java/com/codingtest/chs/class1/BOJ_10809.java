package main.java.com.codingtest.chs.class1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[26];
        char[] inputStr = sc.next().toCharArray();
        Arrays.fill(intArr, -1);

        for(int i = 0; i < inputStr.length; i ++){
            // 처음 등장하는 위치를 공백으로 구분해서 출력
            if(intArr[inputStr[i]- 'a'] == -1){
                intArr[inputStr[i] - 'a'] = i;
            }
        }

        for(int i =0; i < intArr.length -1; i++){
            System.out.print(intArr[i] + " ");
        }
        System.out.print(intArr[intArr.length - 1]);
    }
}
