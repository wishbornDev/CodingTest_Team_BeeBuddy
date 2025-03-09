package s00_null_c01_27_boj02884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        minute -= 45;
        if (minute < 0) {
            hour = (hour + 24 - 1) % 24;
            minute += 60;
        }
        System.out.println(hour + " " + minute);
    }
}
