package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();
        while(size-- > 0){
            numList.add(Integer.parseInt(br.readLine()));
        }

        numList.stream().sorted().forEach(v -> sb.append(v).append('\n'));
        System.out.println(sb);
    }
}
