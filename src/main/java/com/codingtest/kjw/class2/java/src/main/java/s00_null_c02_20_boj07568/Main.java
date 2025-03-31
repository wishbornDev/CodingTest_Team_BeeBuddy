package s00_null_c02_20_boj07568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int numPeople = Integer.parseInt(br.readLine());
            int[][] people = new int[numPeople][2];
            for (int i = 0; i < numPeople; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                people[i][0] = Integer.parseInt(st.nextToken());
                people[i][1] = Integer.parseInt(st.nextToken());
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < numPeople; i++) {
                sb.append(getRank(people, i))
                        .append(" ");
            }
            System.out.println(sb.toString().trim());
        }

    }

    private static int getRank(int[][] people, int index) {
        int rank = 1;
        for (int i = 0; i < people.length; i++) {
            if (people[i][0] > people[index][0] && people[i][1] > people[index][1]) {
                rank += 1;
            }
        }
        return rank;
    }
}
