package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2609 {
    private static int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }

        return gcd(b, a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcdNum = gcd(Math.max(a,b), Math.min(a,b));
        sb.append(gcdNum + "\n");
        int gcmNum = a*b/gcdNum;
        sb.append(gcmNum);

        System.out.println(sb.toString());
    }
}
