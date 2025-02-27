package src.main.java.com.codingtest.ksw.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_30802 {
    public static void main(String[] args) throws IOException {

        /*
         * 2024년 2월 3일 개최 예정인 온사이트 그랜드 아레나에서는 참가자들에게 티셔츠 한 장과 펜 한 자루가 포함된 웰컴 키트를 나눠줄 예정입니다.
         * 키트를 제작하는 업체는 다음과 같은 조건으로만 주문이 가능합니다. 티셔츠는 S, M, L, XL, XXL, 그리고 XXXL의 6가지 사이즈가 있습니다.
         * 티셔츠는 같은 사이즈의 T장 묶음으로만 주문할 수 있습니다.
         * 펜은 한 종류로, P자루씩 묶음으로 주문하거나 한 자루씩 주문할 수 있습니다.
         * 총 N명의 참가자 중 S, M, L, XL, XXL, XXXL 사이즈의 티셔츠를 신청한 사람은 각각 S, M, L, XL, XXL, XXXL명입니다.
         * 티셔츠는 남아도 되지만 부족해서는 안 되고 신청한 사이즈대로 나눠주어야 합니다.
         * 펜은 남거나 부족해서는 안 되고 정확히 참가자 수만큼 준비되어야 합니다.
         * 티셔츠를 T장씩 최소 몇 묶음 주문해야 하는지, 그리고 펜을 P자루씩 최대 몇 묶음 주문할 수 있고,
         * 그 때 펜을 한 자루씩 몇 개 주문하는지 구하세요.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nums = Integer.parseInt(br.readLine()); // 참가자 수

        StringTokenizer tst = new StringTokenizer(br.readLine()); // 사이즈 별 인원

        StringTokenizer bulk = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(bulk.nextToken());
        int P = Integer.parseInt(bulk.nextToken());

        int tCount = 0;
        while (tst.hasMoreTokens()){
            int it = Integer.parseInt(tst.nextToken());
            tCount += it / T;
            tCount = it % T > 0 ? tCount + 1 : tCount;
        }

        System.out.println(tCount);
        System.out.print(nums / P + " " + nums % P);
    }
}
