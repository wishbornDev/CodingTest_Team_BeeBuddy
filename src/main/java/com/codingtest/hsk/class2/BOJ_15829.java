package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_15829 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;
        int r = 1;
        for (int i=0; i<L; i++) {
            sum += (int)((str.charAt(i)-'a'+1) * r) % 1234567891;
            r = (r * 31) % 1234567891;
        }

        System.out.println(sum);

    }
}
