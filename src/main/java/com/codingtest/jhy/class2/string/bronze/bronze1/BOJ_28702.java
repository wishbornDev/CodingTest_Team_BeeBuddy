package main.java.com.codingtest.jhy.class2.string.bronze.bronze1;

import java.io.*;

public class BOJ_28702 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String result = "";
        String[] numbers = new String[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = br.readLine();
        }

        for (int i = 0; i < 3; i++) {
            if (!numbers[i].equals("FizzBuzz") && !numbers[i].equals("Fizz") && !numbers[i].equals("Buzz")) {
                int value = Integer.parseInt(numbers[i]) + (3 - i);

                if (value % 3 == 0 &&  value % 5 == 0) {
                    result = "FizzBuzz";
                } else if (value % 3 == 0) {
                    result = "Fizz";
                } else if (value % 5 == 0) {
                    result = "Buzz";
                } else {
                    result = String.valueOf(value);
                }
                break;
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
    }

}