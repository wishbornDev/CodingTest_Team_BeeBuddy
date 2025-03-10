package s00_null_c01_15_boj10871;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int len = Integer.parseInt(input[0]);
        int threshold = Integer.parseInt(input[1]);

        String[] array = br.readLine().split(" ");
        /* Stream 이용
         * import java.util.Arrays; 이후에 사용 가능
         * int[] numbers = Arrays.stream(strings)  // 스트림으로 변환
                      .mapToInt(Integer::parseInt)  // 각 요소를 int로 변환
                      .toArray();  // int 배열로 변환 */

        for (int i = 0; i < len; i++) {
            int ele = Integer.parseInt(array[i]);
            if (ele < threshold) {
                bw.write(Integer.toString(ele));
                bw.write(" ");
            }
            bw.flush();
        }

    }
}
