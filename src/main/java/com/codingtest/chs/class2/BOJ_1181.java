package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        HashSet<String> wordSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        //String[] strArr = new String[Integer.parseInt(br.readLine())];

        while(length -- > 0){
            wordSet.add(br.readLine());
        }

        wordSet.stream().sorted((a, b)-> {
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            return a.length() - b.length();
        }).forEach(v -> sb.append(v).append('\n'));


        System.out.println(sb);
    }
}
