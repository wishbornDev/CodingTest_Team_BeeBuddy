package main.java.com.codingtest.chs.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            cards.offer(i);
        }
        boolean dropCard = true;
        while (cards.size() > 1) {
            int targetCard = cards.poll();
            if (dropCard) {
                dropCard = false;
            } else {
                cards.offer(targetCard);
                dropCard = true;
            }
        }
        System.out.println(cards.poll());
    }
}
