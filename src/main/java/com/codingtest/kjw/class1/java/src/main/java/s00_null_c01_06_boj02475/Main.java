package s00_null_c01_06_boj02475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] numbers = input.split(" ");
        int check = 0;
        int mod = 10;
        for (String number : numbers) {
            check += Math.pow(Integer.parseInt(number), 2);
            check %= mod;
        }
        System.out.println(check);
    }
}
