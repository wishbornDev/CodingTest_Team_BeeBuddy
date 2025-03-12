package main.java.com.codingtest.oyk.class1;

import java.util.Scanner;

public class BOJ_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EOF(End Of Line) : 문제에 입력이 끝나는 지점, 조건이 없다.
        // 파일의 끝에서 입력받을 데이터가 없으면 알아서 종료시키는 것을 EOF 처리라고 한다.
        // hashNextInt : Boolean 값을 통해 다음 줄이 없으면 false를 반환하고 EOF의 끝을 알려준다.
        while(sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }
    }
}
