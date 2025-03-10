package main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
        /* 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
        정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> hash = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (n > 0) {
            int input = Integer.parseInt(st.nextToken());
            if (hash.get(input) == null) hash.put(input, 1);
            else hash.put(input, hash.get(input) + 1);
            n--;
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        while (m > 0) {
            int input = Integer.parseInt(st.nextToken());
            if (hash.get(input) == null) sb.append(0).append(' ');
            else sb.append(hash.get(input)).append(' ');
            m--;
        }

        System.out.print(sb);
    }
}
