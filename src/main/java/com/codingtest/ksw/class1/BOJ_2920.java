package src.main.java.com.codingtest.ksw.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length]; // 8개 음
        char flag = 'a';

        for(int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        for(int j = 0; j < arr.length; j++) {
            if (j != 0 && j < arr.length-1){
                if(arr[j] +1 == arr[j+1]) {
                    flag = 'a';
                } else if(arr[j] - 1 == arr[j+1]) {
                    flag = 'd';
                } else {
                    flag = 'c';
                    break;
                }
            }
        }
        String str = "";
        if(flag == 'a') {
            str = "ascending";
        } else if (flag == 'd') {
            str = "descending";

        } else {
            str = "mixed";
        }

        System.out.println(str);

    }
}

