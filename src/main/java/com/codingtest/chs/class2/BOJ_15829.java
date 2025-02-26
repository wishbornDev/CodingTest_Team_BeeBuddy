package main.java.com.codingtest.chs.class2;

import java.io.*;
import java.util.*;

public class BOJ_15829 {
    private static final int M = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());    // 문자열 길이
        String str = br.readLine();
        // 입력 문자열
        int hash = 0;    // 해시 값

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            hash += (ch - 'a' + 1)*((int)Math.pow(31,i)) % M;
        }
        System.out.println(hash);
    }
}
