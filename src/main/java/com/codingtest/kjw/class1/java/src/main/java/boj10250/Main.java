package boj10250;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            String line = br.readLine();
            String[] nums = line.split(" ");

            int height = Integer.parseInt(nums[0]);
            int width = Integer.parseInt(nums[1]);
            int order = Integer.parseInt(nums[2]);

            int floor = order % height;
            int room = order / height;

            if (floor != 0) {
                room += 1;
            } else {
                floor = height;
            }

            String roomNum = String.valueOf(room);
            if (room < 10) {
                roomNum = "0" + roomNum;
            }
            bw.write(String.valueOf(floor) + roomNum);
            bw.newLine();
        }
        bw.flush();
    }
}
