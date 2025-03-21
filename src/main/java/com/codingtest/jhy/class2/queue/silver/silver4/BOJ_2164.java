package main.java.com.codingtest.jhy.class2.queue.silver.silver4;

import java.io.*;
import java.util.*;

public class BOJ_2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        bw.write(String.valueOf(queue.peek()));
        bw.flush();
        bw.close();
    }

}