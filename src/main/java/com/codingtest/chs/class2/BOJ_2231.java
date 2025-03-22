package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < num; i++){
            int test = i;
            for(char ch: String.valueOf(i).toCharArray()){
                test += ch - '0';
            }
            if(num == test){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
