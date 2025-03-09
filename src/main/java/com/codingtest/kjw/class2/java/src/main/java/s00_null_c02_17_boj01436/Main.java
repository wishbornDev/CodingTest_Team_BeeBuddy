package s00_null_c02_17_boj01436;

import java.util.Scanner;

public class Main {
    static final int MAX = 10000;
    static final String DEVIL = "666";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] devilNumbers = new int[MAX + 1];
        int count = 1;
        int number = 666;
        while (count <= MAX) {
            if (Integer.toString(number).contains(DEVIL)) {
                devilNumbers[count] = number;
                count += 1;
            }
            number += 1;
        }
        int target = sc.nextInt();

        System.out.println(devilNumbers[target]);
    }
}
