package s00_null_c02_26_boj02164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int number = sc.nextInt();
        Queue<Integer> cards = new LinkedList<>();
        IntStream.range(1, number + 1)
                .forEach(i -> cards.add(i));

        while (cards.size() > 1) {
            cards.poll();
            cards.add(cards.poll());
        }

        System.out.println(cards.poll());
    }
}
