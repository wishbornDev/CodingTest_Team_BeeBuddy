package main.java.com.codingtest.jhy.class1.implementation.bronze.bronze5;

import java.io.*;

public class BOJ_25083 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append("         ,r'\"7\n")
                .append("r`-_   ,'  ,/\n")
                .append(" \\. \". L_r'\n")
                .append("   `~\\/\n")
                .append("      |\n")
                .append("      |\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}