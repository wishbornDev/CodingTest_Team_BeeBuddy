package src.main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {
    static boolean[] prime;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        /* M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        primeNumber();

        for (int i = m; i <= n; i++) {
            if(prime[i]) sb.append(i).append('\n');
        }

        System.out.print(sb);

    }

    private static void primeNumber() {

        for (int i = 2; i * i <= n; i++) {
            for (int j = i + i; j <= n; j += i) {
                prime[j] = false;
            }
        }
    }
}
