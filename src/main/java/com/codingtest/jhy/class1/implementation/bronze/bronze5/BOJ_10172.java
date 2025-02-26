package main.java.com.codingtest.jhy.class1.implementation.bronze.bronze5;

import java.io.*;

public class BOJ_10172 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append("|\\_/|\n")
                .append("|q p|   /}\n")
                .append("( 0 )\"\"\"\\\n")
                .append("|\"^\"`    |\n")
                .append("||_/=\\\\__|");

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}