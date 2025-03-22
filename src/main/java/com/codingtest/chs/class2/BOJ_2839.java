package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int weight = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        for(int five = 0; five*5 <= weight ;five++){
            int remainWeight = weight - five*5;
            if(remainWeight %3 == 0){
                int three = remainWeight / 3;
                min = Math.min(three+five, min);
            }
        }
        if(min == Integer.MAX_VALUE) min = -1;

        System.out.println(min);
    }
}
