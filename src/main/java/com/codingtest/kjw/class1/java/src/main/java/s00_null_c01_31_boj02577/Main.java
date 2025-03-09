package s00_null_c01_31_boj02577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int mul = first * second * third;
        String convertedMul = Integer.toString(mul);
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < convertedMul.length(); j++) {
                if (convertedMul.charAt(j) == Integer.toString(i).charAt(0)) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
