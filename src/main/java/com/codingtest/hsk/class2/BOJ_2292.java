package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2292 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 1;
        int layer = 1;
        while (N>max) {
            layer++;
            max = 1+6*layer*(layer-1)/2;
        }
        System.out.println(layer);
    }
}
