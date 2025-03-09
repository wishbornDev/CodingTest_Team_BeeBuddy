package s00_null_c02_19_boj02751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main { // 209700KB, 1524ms
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Set<Integer> numbers = new HashSet<>();
            int count = Integer.parseInt(br.readLine());
            for (int i = 0; i < count; i++) {
                numbers.add(Integer.parseInt(br.readLine()));
            }

            StringBuilder sb = new StringBuilder();

            numbers.stream()
                    .sorted(Comparator.naturalOrder())
                    .forEach(n -> sb.append(n).append(System.lineSeparator()));

            System.out.println(sb.toString().trim());
        }
    }
}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.TreeSet;
//
//public class Main { // 196420KB,	1716ms. println 쓰면 시간 초과
//    public static void main(String[] args) throws IOException {
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            TreeSet<Integer> numbers = new TreeSet<>();
//            int count = Integer.parseInt(br.readLine());
//            for (int i = 0; i < count; i++) {
//                numbers.add(Integer.parseInt(br.readLine()));
//            }
//            StringBuilder sb = new StringBuilder();
//
//            numbers.stream()
//                    .forEach(n -> sb.append(n).append(System.lineSeparator()));
//
//            System.out.println(sb.toString().trim());
//        }
//    }
//}
