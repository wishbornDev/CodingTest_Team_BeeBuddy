package main.java.com.codingtest.oyk.class1;

import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        String str = sc.next();
        for(int i = 0; i < N; i++) {
            // charAt() 은 해당 문자의 아스키코드 값을 반환하므로
            // 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
