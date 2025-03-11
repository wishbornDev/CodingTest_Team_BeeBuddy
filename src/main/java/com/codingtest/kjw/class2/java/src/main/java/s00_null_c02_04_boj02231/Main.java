package s00_null_c02_04_boj02231;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int number = Integer.parseInt(input);
//        for (int i = 1; i < number; i++) { 310332KB	1604ms
        for (int i = Math.max(1, number - 9 * input.length()); i < number; i++) { // 17740KB	176ms (최적화 잘된 파이썬 코드 참고)
            if (number == getSeparateSum(String.valueOf(i))) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }

    public static int getSeparateSum(String number) {
        return Arrays.stream(number.split(""))
                       .map(Integer::parseInt)
                       .mapToInt(x -> x)
                       .sum() + Integer.parseInt(number);
    }
}

//참고한 파이썬 최적화 풀이: 32412KB, 36ms
//N = int(input())
//
//for i in range(max(1, N - 9 * len(str(N))), N):
//  if i + sum(map(int, str(i))) == N:
//    print(i)
//    break
//  else:
//    print(0)