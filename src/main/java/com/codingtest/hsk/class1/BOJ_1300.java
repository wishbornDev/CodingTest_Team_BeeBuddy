package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1300 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A>B) System.out.println('>');
        else if (B>A) System.out.println('<');
        else System.out.println("==");
   }
    public static void main(String[] args) throws Exception {
        new BOJ_1300().solution();
    }

}
