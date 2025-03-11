package s00_null_c02_21_boj10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main { // 첫 번째 시도: 이쪽이 시간, 메모리 모두 더 좋음
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int numMembers = Integer.parseInt(br.readLine());
            List<String[]> infos = new ArrayList<>();
            for (int i = 0; i < numMembers; i++) {
                infos.add(br.readLine().split(" "));
            }

            StringBuilder sb = new StringBuilder();

            infos.stream()
                    .sorted(Comparator.comparingInt((String[] x) -> Integer.parseInt(x[0]))
                    ).forEach(x -> sb.append(x[0]).append(" ").append(x[1]).append(System.lineSeparator()));

            System.out.println(sb.toString().trim());
        }
    }
}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            final int numMembers = Integer.parseInt(br.readLine());
//            List<String> infos = new ArrayList<>();
//            for (int i = 0; i < numMembers; i++) {
//                infos.add(br.readLine());
//            }
//
//            StringBuilder sb = new StringBuilder();
//
//            infos.stream()
//                    .sorted(Comparator.comparingInt(x -> Integer.parseInt(x.split(" ")[0]))
//                    ).forEach(x -> sb.append(x).append(System.lineSeparator()) );
//
//            System.out.println(sb.toString().trim());
//        }
//    }
//}



