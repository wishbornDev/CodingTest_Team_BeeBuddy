package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cardLength = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(cardLength-- > 0){
            int num = Integer.parseInt(st.nextToken());
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }


        int targetNumsLength = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(targetNumsLength-- > 0){
            int targetNum = Integer.parseInt(st.nextToken());

            sb.append(hashmap.getOrDefault(targetNum, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
