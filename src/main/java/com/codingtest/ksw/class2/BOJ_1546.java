package main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {

        /*
        * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다.
        * 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
          예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
          세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine()); // 과목 수

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        double[] scores = new double[count];

        for (int i = 0; i < count; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(scores);

        double sum = 0.0;
        double avg = 0.0;

        int length = scores.length;

        for (int i = length-1; i >= 0; i--) {
            sum += (scores[i] / scores[length-1] * 100);
        }
        avg = sum / count;

        System.out.println(avg);

    }
}
