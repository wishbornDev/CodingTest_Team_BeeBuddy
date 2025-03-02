package main.java.com.codingtest.jhy.class2.queue.silver.silver3;

import java.io.*;
import java.util.*;

public class BOJ_1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int testCases = Integer.parseInt(st.nextToken());

        while (testCases-- > 0) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<Document> queue = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                queue.offer(new Document(i, num));
            }

            int count = 0;

            while (!queue.isEmpty()) {
                Document document = queue.poll();
                boolean isPriority = false;

                for (Document doc : queue) {
                    if (doc.number > document.number) {
                        isPriority = true;
                        break;
                    }
                }

                if (isPriority) {
                    queue.offer(document);
                } else {
                    count++;
                    if (document.index == m) {
                        break;
                    }
                }
            }

            sb.append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static class Document {
        private final int index;
        private final int number;

        public Document(final int index, final int number) {
            this.index = index;
            this.number = number;
        }
    }

}