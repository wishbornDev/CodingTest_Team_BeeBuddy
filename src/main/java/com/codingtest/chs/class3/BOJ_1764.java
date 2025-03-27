package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> hashset = new HashSet<>();

        List<String> answer = new LinkedList<>();

        for(int i = 0; i < n ; i++){
            hashset.add(br.readLine());
        }

        for(int i = 0; i < m; i++){
            String name = br.readLine();
            if(hashset.contains(name)) answer.add(name);
        }

        sb.append(answer.size()).append("\n");
        answer.sort((a,b) -> a.compareTo(b));

        for(String name: answer){
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
