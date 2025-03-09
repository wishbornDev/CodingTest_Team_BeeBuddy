package main.java.com.codingtest.chs.class2;

import java.io.*;
import java.util.*;

public class BOJ_4153 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] intArr = new int[3];

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < intArr.length; i++){
                intArr[i] = Integer.parseInt(st.nextToken());
            }

            /* 종료 조건 */
            if(intArr[0] == 0 && intArr[1] == 0 && intArr[2] == 0) break;

            /* 오름차순 정렬 */
            Arrays.sort(intArr);
            if (Math.pow(intArr[2], 2) == Math.pow(intArr[1], 2) + Math.pow(intArr[0], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}
