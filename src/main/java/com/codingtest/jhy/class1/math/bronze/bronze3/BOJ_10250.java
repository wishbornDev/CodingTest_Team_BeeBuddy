package main.java.com.codingtest.jhy.class1.math.bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int assignedFloor = n % h == 0 ? h : n % h;
            int assignedRoom = n % h == 0 ? n / h : n / h + 1;

            sb.append(assignedFloor)
                    .append(assignedRoom < 10 ? "0" : "")
                    .append(assignedRoom)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
/*
예외 케이스
2
6 12 54
1 1 1
 */