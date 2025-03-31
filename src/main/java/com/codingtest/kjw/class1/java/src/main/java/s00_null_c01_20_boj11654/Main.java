package s00_null_c01_20_boj11654;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int character = sc.next().charAt(0);
        System.out.println(character);

        /* 위의 방법이 메모리, 시간 모두 좋았음 */
//        char character = sc.next().charAt(0);
//        System.out.println((int) character);
    }
}
