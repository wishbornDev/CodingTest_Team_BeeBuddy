package src.main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2609 {
    public static void main(String[] args) throws IOException {

        /*
         * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = getGCD(a,b); // 최대공약수
        int lcm = (a *b) / gcd; // 최소공배수

        System.out.println(gcd);
        System.out.println(lcm);

    }

    private static int getGCD(int a, int b) {
        if (a % b == 0) return b;
        return getGCD(b, a % b);
    }

}
