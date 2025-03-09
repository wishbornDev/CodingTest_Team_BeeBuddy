package s00_null_c02_12_boj02869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            final int up = Integer.parseInt(st.nextToken());
            final int slip = Integer.parseInt(st.nextToken());
            final int goal = Integer.parseInt(st.nextToken());

            int count = 1 + (int) Math.ceil((double) (goal - up) / (up - slip));

            System.out.println(count);

        }
    }
}

//public class Main { // 시간 초과
//    public static void main(String[] args) throws IOException {
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            final int up = Integer.parseInt(st.nextToken());
//            final int slip = Integer.parseInt(st.nextToken());
//            final int goal = Integer.parseInt(st.nextToken());
//
//            int height = 0;
//            int count = 0;
//
//            while (true) {
//                height += up;
//                count += 1;
//                if (height >= goal) {
//                    break;
//                }
//                height -= slip;
//            }
//            System.out.println(count);
//        }
//    }
//}
