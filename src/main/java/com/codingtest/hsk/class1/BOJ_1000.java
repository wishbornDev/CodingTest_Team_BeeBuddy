package main.java.com.codingtest.hsk.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1000 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A+B);
    }
    public static void main(String[] args) throws Exception {
        new BOJ_1000().solution();
    }

}

//위 코드 메모리 14336 KB, 시간 104 ms
//밑 코드 메모리 17752 kB, 시간 172 ms
//import java.util.Scanner;
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int A = sc.nextInt();
//    int B = sc.nextInt();
//
//    System.out.println(A+B);
//}