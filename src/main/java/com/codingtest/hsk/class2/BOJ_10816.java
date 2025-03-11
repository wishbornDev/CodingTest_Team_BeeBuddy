package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> hm = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st1.nextToken());
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            bw.write(hm.getOrDefault(num, 0)+" ");
        }

        bw.flush();
        bw.close();

    }
}
