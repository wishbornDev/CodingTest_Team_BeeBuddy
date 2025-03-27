package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class BOJ_1620 {
    static Map<String, Integer> nameToNum = new HashMap<>();
    static Map<Integer, String> numToName = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken()); // 포켓몬 개수
        int m = Integer.parseInt(st.nextToken()); // 문제 개수

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameToNum.put(name, i);
            numToName.put(i, name);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (isNum(input)) {
                sb.append(numToName.get(Integer.parseInt(input))).append("\n");
            } else {
                sb.append(nameToNum.get(input)).append("\n");
            }
        }

        System.out.print(sb);
    }

    private static boolean isNum(String str) {
        return Pattern.matches("\\d+", str);
    }
}
