package s00_null_c02_33_boj10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int numCommands = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            LinkedList<Integer> queue = new LinkedList<>();

            for (int i = 0; i < numCommands; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String keyword = st.nextToken();
                int size = queue.size();

                switch (keyword) {
                    case "pop":
                        if (size > 0) {
                            addToBuilder(queue.removeFirst(), sb);
                        } else {
                            addToBuilder(-1, sb);
                        }
                        break;
                    case "size":
                        addToBuilder(size, sb);
                        break;
                    case "empty":
                        addToBuilder(size > 0 ? 0 : 1, sb);
                        break;
                    case "front":
                        if (size > 0) {
                            addToBuilder(queue.peekFirst(), sb);
                        } else {
                            addToBuilder(-1, sb);
                        }
                        break;
                    case "back":
                        if (size > 0) {
                            addToBuilder(queue.peekLast(), sb);
                        } else {
                            addToBuilder(-1, sb);
                        }
                        break;
                    case "push":
                        queue.addLast(Integer.parseInt(st.nextToken()));
                        break;

                }
            }
            System.out.println(sb.toString().trim());
        }
    }

    private static void addToBuilder(int number, StringBuilder sb) {
        sb.append(number).append(System.lineSeparator());
    }
}
