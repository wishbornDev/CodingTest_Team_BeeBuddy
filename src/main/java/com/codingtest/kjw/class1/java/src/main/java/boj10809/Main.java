package boj10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int LEN = 'z' - 'a' + 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();
        int len = word.length();
        int[] indices = new int[LEN];
        for (int i = 0; i < LEN; i++) {
            indices[i] = -1;
        } // Arrays.fill(indices, -1)로 바꿀 수 있음

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = ch - 'a';
            for (int j = 0; j < len; j++) {
                if (ch == word.charAt(j)) {
                    indices[index] = j;
                    break;
                }
            }
            sb.append(indices[index]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
