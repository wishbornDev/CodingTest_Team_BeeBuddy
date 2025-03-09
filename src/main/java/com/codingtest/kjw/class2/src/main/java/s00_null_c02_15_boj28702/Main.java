package s00_null_c02_15_boj28702;

import java.util.Scanner;

public class Main {
    // 0 1 2
    // 0 1 2 3 4
    // -> 세 칸 중 0이 아닌 건 반드시 하나 이상 존재

    static final int INPUT_COUNT = 3;
    static final int MOD1 = 3;
    static final int MOD2 = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] input = new String[INPUT_COUNT];
        for (int i = 0; i < INPUT_COUNT; i++) {
            input[i] = sc.nextLine();
        }

        int number = 0;
        for (int i = 0; i < INPUT_COUNT; i++) {
            if (isNumber(input[i])) {
                number = Integer.parseInt(input[i]) + INPUT_COUNT - i;
                break;
            }
        }

        String print = null;
        if ((number % MOD1) == 0 && (number % MOD2) == 0) {
            print = "FizzBuzz";
        } else {
            if (number % MOD1 != 0 && number % MOD2 != 0) {
                print = Integer.toString(number);
            } else if (number % MOD1 == 0) {
                print = "Fizz";
            } else if (number % MOD2 == 0) {
                print = "Buzz";
            }
        }

        System.out.println(print);

    }

    private static boolean isNumber(String input) {
        return input.charAt(0) != 'F' && input.charAt(0) != 'B';
    }

}
