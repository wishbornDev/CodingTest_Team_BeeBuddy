package boj01001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int front = scanner.nextInt();
        int back = scanner.nextInt();

        System.out.println(front - back);
    }
}
