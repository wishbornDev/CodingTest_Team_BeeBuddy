package main.java.com.codingtest.oyk.class1;

import java.util.Scanner;

public class BOJ_31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result1 = A + B - C;
        System.out.println(result1);

        String strA = String.valueOf(A);
        String strB = String.valueOf(B);
        String strC = String.valueOf(C);

        // 문자열 A + B 연결 후 정수 변환
        // 그 후에 C 빼기
        int result2 = Integer.parseInt(strA + strB) - Integer.parseInt(strC);
        System.out.println(result2);
    }
}
