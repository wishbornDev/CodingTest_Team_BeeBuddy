package s00_null_c02_25_boj01920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int lenNumbers = Integer.parseInt(br.readLine());
            Set<Integer> numbers = new HashSet<>();
            StringTokenizer numberTokenizer = new StringTokenizer(br.readLine());

            for (int i = 0; i < lenNumbers; i++) {
                numbers.add(Integer.parseInt(numberTokenizer.nextToken()));
            }

            int lenToSearch = Integer.parseInt(br.readLine());
            StringTokenizer toSearchTokenizer = new StringTokenizer(br.readLine());

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lenToSearch; i++) {
                int toSearch = Integer.parseInt(toSearchTokenizer.nextToken());
                int print = numbers.contains(toSearch) ? 1 : 0;
                sb.append(print).append(System.lineSeparator());
            }
            System.out.println(sb.toString().trim());

        }
    }
}
