package main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {
        /*
         * N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지
         * 0의 개수를 구하는 프로그램을 작성하시오.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        BigInteger big  = new BigInteger("1");

        /* 팩토리얼 */
        for (int i = 1; i <= n; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }

        String str = big.toString();
        int idx = str.length()-1;
        for(int i= idx; i >=0; i--) {
            if(str.charAt(i) - '0' == 0) count++;
            else break;
        }
        System.out.println(count);
    }
}
