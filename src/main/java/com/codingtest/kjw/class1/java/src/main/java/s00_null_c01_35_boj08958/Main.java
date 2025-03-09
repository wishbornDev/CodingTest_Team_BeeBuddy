package s00_null_c01_35_boj08958;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i < cases; i++) {
            String quiz = br.readLine();
            String[] splittedByX = quiz.split("X");
            int sum = 0;
            for (int j = 0; j < splittedByX.length; j++) {
                int consecutive = splittedByX[j].length();
                sum += consecutive * (consecutive + 1) / 2;
            }
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        bw.flush();

    }
}
