package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10250 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floor = (N % H == 0) ? H : (N % H);
            int room = (N - 1) / H + 1;

            System.out.println(floor + (room < 10 ? "0" : "") + room);
        }
    }
    public static void main(String[] args) throws Exception{
        new BOJ_10250().solution();
    }
}
