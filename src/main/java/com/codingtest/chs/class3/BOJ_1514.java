package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1514 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        String[] expArr = br.readLine().split("-");    // - 를 기준으로 나눔
        sum += sumExp(expArr[0]);


        if(expArr.length > 1){
            for(int i = 1; i < expArr.length; i++){
                sum -= sumExp(expArr[i]);
            }
        }
        System.out.println(sum);
    }

    private static int sumExp(String str){
        int result = 0;
        String[] values = str.split("\\+");
        for(String num: values){
            result += Integer.parseInt(num);
        }

        return result;
    }
}
