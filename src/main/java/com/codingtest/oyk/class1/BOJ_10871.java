package main.java.com.codingtest.oyk.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10871 {
     //1. BufferedReader 방법
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());    // 두 번째 줄을 읽기 위함

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < A.length; i++) {
            if(A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }
    }

    // 2. 스캐너 방법
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int X = sc.nextInt();
//
//        int[] A = new int[N];
//        for(int i = 0; i < N; i++) {
//            A[i] = sc.nextInt();
//        }
//
//        for(int i = 0; i < A.length; i++) {
//            if(A[i] < X) {
//                System.out.print(A[i] + " ");
//            }
//        }
//    }
}
