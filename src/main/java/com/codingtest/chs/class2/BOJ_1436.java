package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int seriesNum = Integer.parseInt(br.readLine());
        String endNum = "666";
        int now = 0;
        int result = 0;
        for(int i = 666; now != seriesNum;i++){
            if(("" + i).contains(endNum)){
                now +=1;
                result = i;
            }
        }
        System.out.println(result);
    }
}
