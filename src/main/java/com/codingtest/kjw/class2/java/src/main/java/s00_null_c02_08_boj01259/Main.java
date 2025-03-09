package s00_null_c02_08_boj01259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String input;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                input = br.readLine();
                if (input.equals("0")) {
                    break;
                }
                int len = input.length();
                int mid = len / 2;
                boolean isPalindrome = true;
                for (int i = 0; i < mid; i++) {
                    if (input.charAt(i) != input.charAt(len - i - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
