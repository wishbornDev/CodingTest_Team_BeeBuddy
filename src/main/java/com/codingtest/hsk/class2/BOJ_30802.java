package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_30802 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());

        int tCount = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        for (int i=0;  i<6; i++) tCount += (Integer.parseInt(st1.nextToken())+T-1)/T;

        System.out.println(tCount);
        System.out.println(people/P+" "+people%P);
    }
    public static void main(String[] args) throws Exception {
        new BOJ_30802().solution();
    }
}
