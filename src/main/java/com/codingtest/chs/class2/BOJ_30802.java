package main.java.com.codingtest.chs.class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int participants = Integer.parseInt(br.readLine());

        StringTokenizer stSize = new StringTokenizer(br.readLine());
        StringTokenizer stBundle = new StringTokenizer(br.readLine());

        double bundleT = Double.parseDouble(stBundle.nextToken());
        int bundleP = Integer.parseInt(stBundle.nextToken());

        int orderT = 0;
        while (stSize.hasMoreTokens()) {
            orderT += (int) Math.ceil(Integer.parseInt(stSize.nextToken()) / bundleT);
        }

        int orderP = participants / bundleP;
        int orderSingleP = participants % bundleP;

        sb.append(orderT + "\n" + orderP + " " + orderSingleP);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
