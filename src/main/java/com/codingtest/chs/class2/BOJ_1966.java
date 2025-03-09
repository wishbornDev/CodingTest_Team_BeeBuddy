package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1966 {

    private static int countPrinter(Queue<int[]> queue, int targetIdx) {
        int count = 0;

        /* 메모리 제한 */
//        private static class Item {
//            int index;
//            int value;
//
//            public Item(int index, int value) {
//                this.index = index;
//                this.value = value;
//            }
//        }

        while (!queue.isEmpty()) {
            int[] maxItem = queue.poll();
            boolean hasHigherPriority = false;

            for (int[] item : queue) {
                if (maxItem[1] < item[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(maxItem);
            } else {
                count++;
                if (maxItem[0] == targetIdx) {
                    return count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            Queue<int[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            int docSize = Integer.parseInt(st.nextToken());
            int targetIdx = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < docSize; i++) {
                queue.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            sb.append(countPrinter(queue, targetIdx)).append("\n");
        }
        System.out.println(sb);
    }
}
