package s00_null_c02_31_boj10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int countCards = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> count = new HashMap<>();
            for (int i = 0; i < countCards; i++) {
                int number = Integer.parseInt(st.nextToken());
                if (count.containsKey(number)) {
                    count.put(number, count.get(number) + 1);
                } else {
                    count.put(number, 1);
                }
            }

            final int countTargets = Integer.parseInt(br.readLine());
            StringTokenizer targetTokenizer = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < countTargets; i++) {
                int target = Integer.parseInt(targetTokenizer.nextToken());
                if (count.containsKey(target)) {
                    sb.append(count.get(target)).append(" ");
                } else {
                    sb.append(0).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }

    }
}
