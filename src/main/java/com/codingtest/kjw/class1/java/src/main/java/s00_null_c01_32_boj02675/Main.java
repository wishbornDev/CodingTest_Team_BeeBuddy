package s00_null_c01_32_boj02675;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i < cases; i++) {
            String input = br.readLine();
            String[] splitted = input.split(" ");
            int rept = Integer.parseInt(splitted[0]);
            String target = splitted[1];

            for (int j = 0; j < target.length(); j++) {
                bw.write(Character.toString(target.charAt(j)).repeat(rept));
            }
            bw.newLine();
            bw.flush();
        }
    }
}
