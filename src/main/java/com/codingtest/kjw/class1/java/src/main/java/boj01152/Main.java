package boj01152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String trimed = input.trim();
        String[] tokens = trimed.split(" ");
        System.out.println(!trimed.isEmpty() ? tokens.length : 0); // empty String일 때 따로 고려.
    }
}
