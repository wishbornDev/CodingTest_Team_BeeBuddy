package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9498 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        if (N>=90) System.out.println('A');
        else if (N>=80) System.out.println('B');
        else if (N>=70) System.out.println('C');
        else if (N>=60) System.out.println('D');
        else System.out.println('F');
    }
    public static void main(String[] args) throws Exception{
        new BOJ_9498().solution();
    }
}
