package main.java.com.codingtest.chs.class1;
import java.util.*;

public class BOJ_10871 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] firstLine = sc.nextLine().split(" ");     // N,X
        String[] secondLine = sc.nextLine().split(" ");    // 비교 대상 요소들
        int x = Integer.parseInt(firstLine[1]);
        List<String> intList = new ArrayList<>();

        for(String str: secondLine){
            int num = Integer.parseInt(str);
            if(num < x){
                intList.add("" + num);
            }
        }

        String result = String.join(" ", intList);
        System.out.println(result);

        sc.close();
    }
}
