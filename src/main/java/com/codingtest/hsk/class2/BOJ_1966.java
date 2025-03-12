package main.java.com.codingtest.hsk.class2;

import java.io.*;
import java.util.*;

public class BOJ_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{i, priority});
                priorityQueue.offer(priority);
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int index = current[0];
                int priority = current[1];

                if (priority == priorityQueue.peek()) {
                    priorityQueue.poll();
                    count++;

                    if (index == M) {
                        sb.append(count).append("\n");
                        break;
                    }
                } else {
                    queue.offer(current);
                }
            }
        }
        System.out.println(sb);
    }
}
