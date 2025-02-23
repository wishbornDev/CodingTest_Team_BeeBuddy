package src.main.java.com.codingtest.ksw.class1;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BOJ_27866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        sb.append(br.readLine());
        int i = Integer.parseInt(br.readLine());

        System.out.println(sb.substring(i-1,i));

    }

}

