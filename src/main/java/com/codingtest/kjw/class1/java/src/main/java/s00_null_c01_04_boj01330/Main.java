package s00_null_c01_04_boj01330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int front = scanner.nextInt();
        int back = scanner.nextInt();

        System.out.println(printIneqaulity(front, back));

    }

    public static String printIneqaulity(int front, int back) {
        if (front > back) {
            return ">";
        }
        if (front < back) {
            return "<";
        }
        return "==";
    }
}
