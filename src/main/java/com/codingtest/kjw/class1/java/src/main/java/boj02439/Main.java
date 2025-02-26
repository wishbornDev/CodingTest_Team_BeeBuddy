package boj02439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(" ".repeat(num - i) + "*".repeat(i));
        }

    }
}
