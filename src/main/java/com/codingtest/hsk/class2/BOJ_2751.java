package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i<N; i++) arr[i] = Integer.parseInt(br.readLine());
        br.close();

        Arrays.sort(arr);

        for (int i=0; i<N; i++) bw.write(arr[i]+"\n");
        bw.flush();
        bw.close();

    }
}

