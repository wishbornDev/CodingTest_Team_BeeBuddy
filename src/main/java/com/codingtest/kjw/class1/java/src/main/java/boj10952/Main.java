package boj10952;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "DEFAULT";
        while (true) {
            input = br.readLine();
            if (input.equals("0 0")) {
                break;
            }
            String[] ints = input.split(" ");
            int front = Integer.parseInt(ints[0]);
            int back = Integer.parseInt(ints[1]);
            bw.write(Integer.toString(front + back));
            bw.newLine();
        }
        bw.flush();
    }
}
