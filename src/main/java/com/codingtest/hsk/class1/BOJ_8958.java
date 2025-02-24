package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BOJ_8958 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int j=0; j<T; j++) {
            String st = br.readLine();

            int score = 1;
            int sum = 0;
            char ch = 'X';
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == 'O') {
                    if (st.charAt(i) == ch) {
                        score++;
                    }
                    sum += score;
                } else {
                    score = 1;
                }
                ch = st.charAt(i);
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) throws Exception {
        new BOJ_8958().solution();
    }
}
