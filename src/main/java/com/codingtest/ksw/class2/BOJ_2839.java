package main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {

        /*
         * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.
         * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
         * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
         * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
         * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만,
         * 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
         * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때,
         * 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        /* 3 or 5로 절대 나눠지지 않는 경우 */
        if (n == 4 || n == 7) count--;
            /* 무게가 5키로 짜리로만 채울 수 있는 경우 */
        else if (n % 5 == 0) count = n / 5;
            /* 5의 배수 + 1 or 5의 배수 + 3 */
        else if (n % 5 == 1 || n % 5 == 3) count = (n / 5) + 1;
            /* 5의 배수 + 2 or 5의 배수 + 4 */
        else if (n % 5 == 2 || n % 5 == 4) count = (n / 5) + 2;

        System.out.println(count);
    }
}
