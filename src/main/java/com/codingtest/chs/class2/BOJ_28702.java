package main.java.com.codingtest.chs.class2;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class BOJ_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        List<String> fizzBuzz = Arrays.asList("Fizz", "Buzz", "FizzBuzz");
        arr[0] = br.readLine();
        arr[1] = br.readLine();
        arr[2] = br.readLine();
        int intNum = 0;
        int addNum = 0;

        for(int i = 0; i < arr.length; i++){
            if(!fizzBuzz.contains(arr[i])){
                intNum = Integer.parseInt(arr[i]);
                addNum = 3 - i;
            }
        }

        int resultNum = intNum + addNum;
        if(resultNum %3 == 0 && resultNum % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(resultNum % 5 == 0){
            System.out.println("Buzz");
        } else if(resultNum % 3 == 0){
            System.out.println("Fizz");
        } else{
            System.out.println(resultNum);
        }
    }
}
