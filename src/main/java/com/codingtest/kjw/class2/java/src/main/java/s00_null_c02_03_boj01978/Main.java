package s00_null_c02_03_boj01978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ignore = br.readLine();
//        int countOfGivenNumbers = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] tokens = input.split(" ");
        int[] numbers = Arrays.stream(tokens)
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = (int) Arrays.stream(numbers)
                .filter(Main::isPrime)
                .count();

        br.close();
        System.out.println(count);
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
