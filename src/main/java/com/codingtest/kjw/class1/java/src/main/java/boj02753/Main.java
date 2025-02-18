package boj02753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static int isLeapYear(int year) {
        if (year % 4 != 0) {
            return 0;
        }
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return 1;
            }
            return 0;
        }
        return 1;
    }
}
