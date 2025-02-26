package boj27866;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        int position = sc.nextInt();
        System.out.println(input[position - 1]);
    }
}
