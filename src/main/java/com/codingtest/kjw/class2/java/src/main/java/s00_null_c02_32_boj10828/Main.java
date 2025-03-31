package s00_null_c02_32_boj10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);

            int countCommands = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < countCommands; i++) {
                String command = br.readLine();
                StringTokenizer st = new StringTokenizer(command);
                int add;
                String keyword = st.nextToken();

                switch (keyword) {
                    case "top":
                        add = stack.peek();
                        addToBuilder(add, sb);
                        break;
                    case "pop":
                        if (stack.size() > 1) {
                            add = stack.pop();
                        } else {
                            add = -1;
                        }
                        addToBuilder(add, sb);
                        break;
                    case "empty":
                        if (stack.size() > 1) {
                            add = 0;
                        } else {
                            add = 1;
                        }
                        addToBuilder(add, sb);
                        break;
                    case "size":
                        add = stack.size() - 1;
                        addToBuilder(add, sb);
                        break;
                    case "push":
                        add = Integer.parseInt(st.nextToken());
                        stack.push(add);
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

/*
switch (keyword) {
    case "top" -> {
        add = stack.peek();
        addToBuilder(add, sb);
    }
    case "pop" -> {
        if (stack.size() > 1) {
            add = stack.pop();
        } else {
            add = -1;
        }
        addToBuilder(add, sb);
    }
    case "empty" -> {
        if (stack.size() > 1) {
            add = 0;
        } else {
            add = 1;
        }
        addToBuilder(add, sb);
    }
    case "size" -> {
        add = stack.size() - 1;
        addToBuilder(add, sb);
    }
    case "push" -> {
        add = Integer.parseInt(st.nextToken());
        stack.push(add);
    }
}
 */