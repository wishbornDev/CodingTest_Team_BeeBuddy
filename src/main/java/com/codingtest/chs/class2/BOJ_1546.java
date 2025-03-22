package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[length];
        double maxNum = 0.0;
        double sum = 0.0;

        for (int i = 0; i < length; i++) {
            double num = Double.parseDouble(st.nextToken());
            if (num > maxNum) {
                maxNum = num;
            }
            sum += num;
        }

        sum = (sum / maxNum) * 100;

        System.out.println(sum/length);

    }
}
