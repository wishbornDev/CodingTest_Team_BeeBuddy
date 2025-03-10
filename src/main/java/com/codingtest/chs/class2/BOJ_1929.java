package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1929 {
    private static boolean[] isPrime;
    private static int START_NUM;
    private static int END_NUM;

    private static void makePrime() {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= END_NUM; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= END_NUM; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        START_NUM = Integer.parseInt(st.nextToken());
        END_NUM = Integer.parseInt(st.nextToken());

        isPrime = new boolean[END_NUM + 1];

        makePrime();

        for (int i = START_NUM; i <= END_NUM; i++) {
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }
}
