package main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {
    static int[] narr;

    public static void main(String[] args) throws IOException {
        /*
         * N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        narr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(narr);

        int m = Integer.parseInt(br.readLine());
        int[] marr = new int[m];

        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {

            if(search(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.print(sb);
    }

    private static int search(int num) {
    // 중간값이랑 비교하기
        int left = 0;
        int right = narr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (num < narr[mid]) {
                right = mid - 1;
            } else if (num > narr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
