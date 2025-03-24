package main.java.com.codingtest.jhy.class3.graph.bfs.gold.gold4;

import java.io.*;
import java.util.*;

public class BOJ_9019 {

    private static String result;
    private static int a, b;
    private static boolean[] visited;
    private static char[] operation = {'D', 'S', 'L', 'R'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            visited = new boolean[10000];

            bfs(a);

            sb.append(result).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void bfs(int start) {
        Queue<Cache> queue = new LinkedList<>();
        queue.offer(new Cache(start, ""));
        visited[start] = true;

        while (!queue.isEmpty()) {
            Cache cache = queue.poll();

            if (cache.value == b) {
                result = cache.command;
                return;
            }

            for (int i = 0; i < 4; i++) {
                int calResult = calculateValue(cache.value, operation[i]);

                if (!visited[calResult]) {
                    visited[calResult] = true;
                    queue.offer(new Cache(calResult, cache.command + operation[i]));
                }
            }
        }
    }

    private static int calculateValue(int value, char operation) {
        if (operation == 'D') {
            return (value * 2) % 10000;
        } else if (operation == 'S') {
            return value == 0 ? 9999 : value - 1;
        } else if (operation == 'L') {
            return (value % 1000) * 10 + value / 1000;
        } else {
            return (value / 10) + (value % 10) * 1000;
        }
    }

    private static class Cache {
        private int value;
        private String command;

        public Cache(int value, String command) {
            this.value = value;
            this.command = command;
        }
    }

}