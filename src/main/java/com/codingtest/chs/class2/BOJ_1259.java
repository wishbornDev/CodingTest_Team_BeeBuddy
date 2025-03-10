package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while(!(str = br.readLine()).equals("0")){
            int length = str.length();
            boolean isMirror = true;
            for(int i = 0; i < length / 2; i++){
                if(str.charAt(i) != str.charAt(length -1 -i)){
                    isMirror = false;
                    break;
                }
            }
            System.out.println(isMirror ?"yes": "no");
        }
    }
}
