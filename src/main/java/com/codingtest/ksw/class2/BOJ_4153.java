package src.main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4153 {
    public static void main(String[] args) throws IOException {

        /*
         * 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
         * 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
         * a² + b² = c²
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int a, b, c;

        while(true) {

            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (a == 0 && b== 0 && c == 0) break;

            if (a > b && a > c) {
                int temp = a;
                a = c;
                c = temp;
            }

            if (b > c && b > a) {
                int temp = b;
                b = c;
                c = temp;
            }

            if (a*a + b*b == c*c ) System.out.println("right");
            else System.out.println("wrong");

        }
    }
}
