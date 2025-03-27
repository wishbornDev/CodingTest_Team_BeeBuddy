package main.java.com.codingtest.chs.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        Map<String, Integer> categories;
        while(testCase-- > 0){
            categories = new HashMap<>();
            int size = Integer.parseInt(br.readLine());
            if(size == 0){
                sb.append(0).append("\n");
                continue;
            }
            for(int i = 0; i < size; i++){
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken(); // 안씀!
                String category = st.nextToken();
                if(categories.containsKey(category)){
                    categories.put(category, categories.get(category) + 1);
                }else{
                    categories.put(category, 2);
                }
            }
            int result = 1;
            for(String cat: categories.keySet()){
                result *= categories.get(cat);
            }
            sb.append(result - 1).append("\n");
        }
        System.out.println(sb);
    }
}
