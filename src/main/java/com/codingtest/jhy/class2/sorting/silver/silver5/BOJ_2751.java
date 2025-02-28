package main.java.com.codingtest.jhy.class2.sorting.silver.silver5;

import java.io.*;

public class BOJ_2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[2000001];

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000]++;
        }

        for (int i = 0; i <= 2000000; i++) {
            if (arr[i] == 1) {
                sb.append(i - 1000000)
                        .append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
/*
처음 푼 코드
public class BOJ_2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }

        Collections.sort(list);

        for (int val : list) {
            sb.append(val)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
 */