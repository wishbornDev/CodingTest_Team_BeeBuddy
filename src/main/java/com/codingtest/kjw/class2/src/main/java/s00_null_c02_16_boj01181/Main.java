package s00_null_c02_16_boj01181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int wordCount = Integer.parseInt(br.readLine());
            TreeSet<String> words = new TreeSet<>();
            for (int i = 0; i < wordCount; i++) {
                String word = br.readLine();
                words.add(word);
            }

            Stream<String> sortedWords = words.stream()
                    .sorted(Comparator.comparing(x -> ((String) x).length())
                            .thenComparing(x -> (String) x)
                    );

            sortedWords.forEach(System.out::println);
        }
    }
}
