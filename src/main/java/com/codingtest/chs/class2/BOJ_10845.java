package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_10845 {
    private static Deque<Integer> deque = new LinkedList<>();
    private static void push(int num){
        deque.offer(num);
    }
    private static int pop(){
        return deque.isEmpty()? -1 :deque.poll();
    }
    private static int size(){
        return deque.size();
    }
    private static int empty(){
        return deque.isEmpty() ? 1 : 0;
    }
    private static int front(){
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }
    private static int back(){
        return deque.isEmpty() ? -1 : deque.peekLast();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        while(testCase-- > 0){
            String[] arr = br.readLine().split(" ");

            switch(arr[0]){
                case "push":
                    push(Integer.parseInt(arr[1]));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
