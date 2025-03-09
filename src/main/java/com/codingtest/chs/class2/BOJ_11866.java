package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int startNum = 1;

        sb.append("<");
        // 데이터 입력
        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }

        while(!queue.isEmpty()){
            if(queue.size() == 1){
                sb.append(queue.poll());
                break;
            }
            if(startNum % k != 0){
                queue.offer(queue.poll());
            }else{
                sb.append(queue.poll()).append(", ");
            }
            startNum +=1;
        }
        sb.append(">");

        System.out.println(sb);
    }
}
