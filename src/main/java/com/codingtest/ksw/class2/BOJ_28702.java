package main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_28702 {
    public static void main(String[] args) throws IOException {
        /*
         * FizzBuzz 문제는 i = 1, 2, ...에 대해 다음 규칙에 따라 문자열을 한 줄에 하나씩 출력하는 문제입니다.
         * i가 3의 배수이면서 5의 배수이면 “FizzBuzz”를 출력합니다.
         * i가 3의 배수이지만 5의 배수가 아니면 “Fizz”를 출력합니다.
         * i가 3의 배수가 아니지만 5의 배수이면 “Buzz”를 출력합니다.
         * i가 3의 배수도 아니고 5의 배수도 아닌 경우 i를 그대로 출력합니다.
         * FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 주어집니다.
         *  이때, 이 세 문자열 다음에 올 문자열은 무엇일까요?
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        boolean isNumber = false;

        for(int i = 0; i < 3; i++) {
            String str = br.readLine();

            char c = str.charAt(0);

            if(c != 'F' && c != 'B') {
                num = Integer.parseInt(str);
                isNumber = true;
            }

            if(isNumber) {
                num++;
            }
        }

        System.out.println(getFizzBuzz(num));
    }

    private static String getFizzBuzz(int num) {

        if(num % 15 == 0) return "FizzBuzz";
        else if (num % 3 == 0) return "Fizz";
        else if (num % 5 == 0) return "Buzz";
        else return Integer.toString(num);
    }
}
