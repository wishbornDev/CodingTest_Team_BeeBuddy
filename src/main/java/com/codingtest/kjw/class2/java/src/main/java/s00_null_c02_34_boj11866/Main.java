package s00_null_c02_34_boj11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> humans = new LinkedList<>();
        final int numHumans = sc.nextInt();
        final int period = sc.nextInt();
        StringBuilder sb = new StringBuilder("<");

        for (int i = 1; i <= numHumans; i++) {
            humans.offer(i);
        }
        while (!humans.isEmpty()) {
            for (int i = 1; i < period; i++) {
                humans.offer(humans.poll());
            }
            sb.append(humans.poll())
                    .append(" ");
        }
        System.out.print(sb.toString().trim().replace(" ", ", "));
        System.out.print(">");
    }
}