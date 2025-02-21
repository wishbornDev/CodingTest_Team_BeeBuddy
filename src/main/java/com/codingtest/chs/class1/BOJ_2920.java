package main.java.com.codingtest.chs.class1;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ_2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 1번 번호로 처음 필터링
        int prevNum = sc.nextInt();

        if(prevNum == 1){
            while(sc.hasNext()){
                int nextNum = sc.nextInt();
                if(isAsc(prevNum, nextNum)){
                    prevNum = nextNum;
                }else{
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        }else if (prevNum == 8){
            while(sc.hasNext()){
                int nextNum = sc.nextInt();
                if(isDesc(prevNum, nextNum)){
                    prevNum = nextNum;
                }else{
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }

    }

    public static boolean isAsc(int prevNum, int nextNum){
        return prevNum + 1 == nextNum;
    }

    public static boolean isDesc(int prevNum, int nextNum){
        return prevNum - 1 == nextNum;
    }
}
