package s00_null_c02_10_boj02609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            int gcd = gcd(first, second);
            int lcm = first * second / gcd;

            System.out.println(gcd);
            System.out.println(lcm);
        }
    }

    private static int gcd(int first, int second) {
        // 유클리드 호제법: O(log N)
        while (second != 0) {
            int tmp = first % second;
            first = second;
            second = tmp;
        }
        return first;
    }
}
