package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2577 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A*B*C;
        String resultStr = Integer.toString(result);

        for (int i=0; i<10; i++) {
            int count = 0;
            char ch = (char) ('0'+i);

            for (int j=0;  j<resultStr.length(); j++) {
                if(resultStr.charAt(j) == ch) count++;
            }
            System.out.println(count);
        }

        }

    public static void main(String[] args) throws Exception {
        new BOJ_2577().solution();
    }
}
