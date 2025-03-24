package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_28702 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = "";
        int k = 0;
        for (int i=0; i<3; i++) {
            num = br.readLine();
            if (num.charAt(0)>='0' && num.charAt(0)<='9') {
                k = i;
                break;
            }
        }
        int resultNum = Integer.parseInt(num)+3-k;

        StringBuilder sb = new StringBuilder();
        if (resultNum % 3 == 0) sb.append("Fizz");
        if (resultNum % 5 == 0) sb.append("Buzz");
        if(sb.length() == 0) sb.append(resultNum);

        System.out.println(sb);
    }
}
