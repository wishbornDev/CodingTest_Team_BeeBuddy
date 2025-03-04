package main.java.com.codingtest.jhy.class2.queue.silver.silver4;

import java.io.*;
import java.util.*;

public class BOJ_11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        List<String> list = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            list.add(String.valueOf(queue.poll()));
        }

        bw.write("<" + String.join(", ", list) + ">");
        bw.flush();
        bw.close();
    }

}