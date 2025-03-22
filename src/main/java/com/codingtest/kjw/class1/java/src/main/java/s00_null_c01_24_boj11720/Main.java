package s00_null_c01_24_boj11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        int sum = 0;
        for (char character : chars) {
            sum += Integer.parseInt(Character.toString(character));
        }
        System.out.println(sum);

    }
}
