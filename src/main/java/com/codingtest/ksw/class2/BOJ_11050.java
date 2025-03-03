package src.main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11050 {
    public static void main(String[] args) throws IOException {
        /*
         * 자연수 N과 정수 K가 주어졌을 때 이항 계수 binom{N}{K}를 구하는 프로그램을 작성하시오.
         * 원소 N개에서 K개를 뽑기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        sb.append(factorial(N)/(factorial(K)*(factorial(N-K)))).append("\n");

        System.out.println(sb);

    }

    private static int factorial(int n) {
        int result = 1; // 0과 1의 팩토리얼 1
        for(int i = 2; i <= n; i++) {
            result = result  * i;
        }
        return result;
    }
}
