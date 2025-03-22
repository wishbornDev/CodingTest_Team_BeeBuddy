package main.java.com.codingtest.chs.class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1978 {
    private static boolean isDecimal(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if( num % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(isDecimal(num)) {
                result +=1;
            }
        }
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
