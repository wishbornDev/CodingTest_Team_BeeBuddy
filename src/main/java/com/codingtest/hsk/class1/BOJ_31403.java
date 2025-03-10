package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_31403 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        System.out.println(Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C));
        System.out.println(Integer.parseInt(A+B)-Integer.parseInt(C));

    }
    public static void main(String[] args) throws Exception{
        new BOJ_31403().solution();
    }
}
