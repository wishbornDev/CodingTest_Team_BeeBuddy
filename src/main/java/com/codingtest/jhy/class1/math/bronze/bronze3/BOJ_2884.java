package main.java.com.codingtest.jhy.class1.math.bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2884 {

    private static final int MIDNIGHT_HOUR = 0;
    private static final int PREVIOUS_HOUR = 23;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int ALARM_MINUTE_OFFSET = 45;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new  StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m >= ALARM_MINUTE_OFFSET) {
            bw.write(h + " " + (m - ALARM_MINUTE_OFFSET));
        } else {
            if (h == MIDNIGHT_HOUR) {
                bw.write(PREVIOUS_HOUR + " " + (MINUTES_IN_HOUR + (m - ALARM_MINUTE_OFFSET)));
            } else {
                bw.write(--h + " " + (MINUTES_IN_HOUR + (m - ALARM_MINUTE_OFFSET)));
            }
        }

        bw.flush();
        bw.close();
    }

}