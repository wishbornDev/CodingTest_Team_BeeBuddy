package s00_null_c02_38_boj02108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int len = Integer.parseInt(br.readLine());
            int[] numbers = new int[len];
            for (int i = 0; i < len; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(numbers);
            Map<Integer, Integer> count = new HashMap<>();
            int maxCount = 0;
            for (int number : numbers) {
                if (count.containsKey(number)) {
                    count.put(number, count.get(number) + 1);
                } else {
                    count.put(number, 1);
                }
                maxCount = Math.max(count.get(number), maxCount);
            }

            final int max = maxCount; // 람다식에 쓰려면 final 또는 유사 final 필요 (한 번만 초기화되고 값이 변경되지 않는 변수)

            int mean = (int) Math.round((double) Arrays.stream(numbers).sum() / numbers.length);
            int median = numbers[numbers.length / 2];
            int[] modes = count.entrySet().stream()
                    .filter(x -> count.get(x.getKey()) == max)
                    .mapToInt(x -> x.getKey())
                    .toArray();
            Arrays.sort(modes);
            int mode = modes[Math.min(modes.length - 1, 1)];
            int range = numbers[numbers.length - 1] - numbers[0];

            System.out.println(mean);
            System.out.println(median);
            System.out.println(mode);
            System.out.println(range);
        }
    }
}
