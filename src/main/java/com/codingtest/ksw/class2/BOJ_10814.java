package main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10814 {
    public static void main(String[] args) throws IOException {
        /*
         * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
         * 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder[] sbArr = new StringBuilder[201]; // 1~200

        for(int i = 0; i < sbArr.length; i++) {
            sbArr[i] = new StringBuilder();
        }

        StringTokenizer st = null;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            // age -> index,
            sbArr[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder sb = new StringBuilder();
        for(StringBuilder s : sbArr) {
            sb.append(s);
        }

        System.out.print(sb);

    }
}
