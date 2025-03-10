package s00_null_c02_37_boj01966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            final int numTests = Integer.parseInt(br.readLine());
            for (int i = 0; i < numTests; i++) {
                Queue<Integer> numbers = new LinkedList<>();
                LinkedList<Integer> priorities = new LinkedList<>();

                StringTokenizer targetTokenizer = new StringTokenizer(br.readLine());

                int len = Integer.parseInt(targetTokenizer.nextToken());
                int target = Integer.parseInt(targetTokenizer.nextToken());

                StringTokenizer priorityTokenizer = new StringTokenizer(br.readLine());

                for (int j = 0; j < len; j++) {
                    numbers.offer(j);
                    priorities.addLast(Integer.parseInt(priorityTokenizer.nextToken()));
                }

                int order = 0;
                while (numbers.contains(target)) {
                    int max = priorities.stream()
                            .max(Comparator.naturalOrder()).orElse(0);

                    if (priorities.getFirst() == max) {
                        numbers.poll();
                        priorities.removeFirst();
                        order += 1;
                    } else {
                        numbers.offer(numbers.poll());
                        priorities.addLast(priorities.removeFirst());
                    }
                }
                sb.append(order).append(System.lineSeparator());
            }
            System.out.println(sb.toString().trim());
        }
    }
}