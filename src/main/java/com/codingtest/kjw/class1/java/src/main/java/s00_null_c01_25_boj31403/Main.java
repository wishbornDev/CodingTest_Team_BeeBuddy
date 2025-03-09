package s00_null_c01_25_boj31403;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int aConcatB = Integer.parseInt(Integer.toString(a) + Integer.toString(b));

        System.out.println(a + b - c);
        System.out.println(aConcatB - c);
    }
}
