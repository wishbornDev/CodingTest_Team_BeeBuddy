package s00_null_c02_36_boj01929;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static final int MAX = 1_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        final int begin = Integer.parseInt(st.nextToken());
        final int end = Integer.parseInt(st.nextToken());

        boolean[] eratosSeive = eratosSeive(end);
        for (int i = begin; i <= end; i++) {
            if (eratosSeive[i]) {
                sb.append(i)
                        .append(System.lineSeparator());
            }
        }
        System.out.println(sb.toString().trim());

    }

    private static boolean[] eratosSeive(int end) {
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        int last = (int) Math.sqrt(end);
        for (int i = 2; i <= last; i++) {
            int j = 2;
            while (i * j <= end) {
                isPrime[i * j] = false;
                j += 1;
            }
        }
        return isPrime;
    }
}
