package boj02920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int[] converted = new int[numbers.length];
        String result = "mixed";

        boolean ascending = false;
        boolean descending = false;

        for (int i = 0; i < numbers.length; i++) {
            converted[i] = Integer.parseInt(numbers[i]);
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (converted[i] < converted[i + 1]) {
                ascending = true;
            }
            if (converted[i] > converted[i + 1]) {
                descending = true;
            }
        }
        if (ascending && !descending) {
            result = "ascending";
        }
        if (descending && !ascending) {
            result = "descending";
        }
        System.out.println(result);

    }
}

//import java.io.*; 제출했던 틀린 풀이
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] numbers = br.readLine().split(" ");
//        int[] converted = new int[numbers.length];
//        String result = "mixed";
//
//        for (int i = 0; i < numbers.length; i++) {
//            converted[i] = Integer.parseInt(numbers[i]);
//            if (converted[i] != i + 1 && converted[i] != 8 - i) {
//                System.out.println(result);
//                return;
//            }
//        }
//        if (converted[0] == 1) {
//            result = "ascending";
//        } else {
//            result = "descending";
//        }
//        System.out.println(result);
//
//    }
//}
