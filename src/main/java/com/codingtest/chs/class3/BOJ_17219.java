package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> hashmap = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            hashmap.put(st.nextToken(), st.nextToken());
        }

        for(int i = 0; i < m ; i++){
            sb.append(hashmap.get(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }
}
