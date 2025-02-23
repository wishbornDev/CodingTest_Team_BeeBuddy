package src.main.java.com.codingtest.ksw.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_31403 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int sum1 = a + b - c;
        String sA = String.valueOf(a);
        String sB = String.valueOf(b);
        int sum2 = Integer.parseInt(sA + sB) - c;

        System.out.println(sum1);
        System.out.println(sum2);

    }
}

