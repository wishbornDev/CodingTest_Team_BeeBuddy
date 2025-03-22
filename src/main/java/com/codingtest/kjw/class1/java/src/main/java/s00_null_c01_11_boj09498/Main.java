package s00_null_c01_11_boj09498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(grade(score));
    }

    public static char grade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        }
        if (score >= 80 && score < 90) {
            return 'B';
        }
        if (score >= 70 && score < 80) {
            return 'C';
        }
        if (score >= 60 && score < 70) {
            return 'D';
        }
        return 'F';
    }
}
