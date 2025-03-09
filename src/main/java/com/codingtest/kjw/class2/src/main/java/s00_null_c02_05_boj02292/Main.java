package s00_null_c02_05_boj02292;

import java.util.Scanner;

public class Main {
    static final int INCREASE_UNIT = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int number = sc.nextInt();
        int currentMax = 1;
        int counter = 1;
        while (currentMax < number) {
            currentMax += counter * INCREASE_UNIT;
            counter += 1;
        }
        System.out.println(counter);

    }
}
