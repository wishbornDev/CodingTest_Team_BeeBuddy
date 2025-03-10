package main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BOJ_2751 {
    public static void main(String[] args) throws IOException {
        /*
         * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new TreeSet<>();

        while(n > 0) {
            set.add(Integer.parseInt(br.readLine()));
            n--;
        }

        Iterator<Integer> iter = set.iterator();

        while(iter.hasNext()) {
            sb.append(iter.next()).append("\n");
        }
        System.out.print(sb);
    }
}
