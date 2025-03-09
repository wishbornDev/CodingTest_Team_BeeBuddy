package s00_null_c01_17_boj10951;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (true) {
            input = br.readLine();
            if (input == null) { //input.equals("")
                break;
            }
            String[] ints = input.split(" ");
            int first = Integer.parseInt(ints[0]);
            int second = Integer.parseInt(ints[1]);
            bw.write(Integer.toString(first + second));
            bw.newLine();
        }
        bw.flush();
    }
}
