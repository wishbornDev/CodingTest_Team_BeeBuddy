package main.java.com.codingtest.hsk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=N; i++) queue.offer(i);

        result.append("<");
        for (int i=0; i<N; i++) {
            for (int j = 1; j < K; j++) queue.offer(queue.poll());
            result.append(queue.poll());
            if (!queue.isEmpty()) result.append(", ");
        }
        result.append(">");

        System.out.println(result.toString());
    }
}
