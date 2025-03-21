package main.java.com.codingtest.jhy.class2.sorting.silver.silver5;

import java.io.*;
import java.util.*;

public class BOJ_10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<Member> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            list.add(new Member(age, name));
        }

        list.sort(Comparator.comparingInt(m -> m.age));

        for (Member member : list) {
            sb.append(member.age)
                    .append(" ")
                    .append(member.name)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static class Member {

        private final int age;
        private final String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

}