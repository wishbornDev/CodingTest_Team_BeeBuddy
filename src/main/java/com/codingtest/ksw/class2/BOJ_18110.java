package src.main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_18110 {
    public static void main(String[] args) throws IOException {
        /* 어떤 문제의 난이도는 그 문제를 푼 사람들이 제출한 난이도 의견을 바탕으로 결정한다.
        난이도 의견은 그 사용자가 생각한 난이도를 의미하는 정수 하나로 주어진다.
        solved.ac가 사용자들의 의견을 바탕으로 난이도를 결정하는 방식은 다음과 같다.
        아직 아무 의견이 없다면 문제의 난이도는 0으로 결정한다.
        의견이 하나 이상 있다면, 문제의 난이도는 모든 사람의 난이도 의견의 30% 절사평균으로 결정한다.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int idx = (int)Math.round(n * 0.15);

        double sum = 0;

        for (int i = idx; i < n - idx; i++) {
            sum += arr[i];
        }

        System.out.println((int)Math.round(sum / (n - 2 * idx)));

    }
}
