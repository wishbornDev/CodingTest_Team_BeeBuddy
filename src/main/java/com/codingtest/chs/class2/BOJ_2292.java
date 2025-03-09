package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int maxPad = 1;
        int step = 1;
        for(step = 1; maxPad < num; step++){
            maxPad += 6*step;
        }
        System.out.println(step);
    }
}
