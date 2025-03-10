package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 1; i <= num ; i++){
            int temp = i;
            while(temp % 5 == 0){
                temp /= 5;
                result +=1;
            }
        }

        System.out.println(result);
    }
}
