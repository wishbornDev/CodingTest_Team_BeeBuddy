package main.java.com.codingtest.ksw.class2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {

        /*
         * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // N개

        String numbers = br.readLine();
        StringTokenizer st = new StringTokenizer(numbers);
        int count = 0;

        while (st.hasMoreTokens()) {
            boolean isPrime = true;
            int num = Integer.parseInt(st.nextToken());
            if(num == 1) continue;
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) count++;
        }
        System.out.println(count);

    }
}
