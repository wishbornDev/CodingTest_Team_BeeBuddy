package s00_null_c01_05_boj02438;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
