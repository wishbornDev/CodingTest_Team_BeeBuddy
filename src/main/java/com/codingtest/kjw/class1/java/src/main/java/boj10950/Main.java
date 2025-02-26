package boj10950;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lenTestCases = Integer.parseInt(br.readLine());
        for (int i = 1; i <= lenTestCases; i++) {
            String[] input = br.readLine().split(" ");
            int front = Integer.parseInt(input[0]);
            int back = Integer.parseInt(input[1]);
            bw.write(Integer.toString(front + back));
            bw.newLine(); // bw.write("%n"); 하면 그대로 %로 출력됨
        }
        bw.flush();
    }
}
