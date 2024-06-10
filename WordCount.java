import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {
        // Example input string
        String input = "The quick brown fox jumps over the lazy dog. the lazy dog slept.";

        // Map to store word counts
        Map<String, Integer> wordCounts = new TreeMap<>();

        // Split the input string by non-word characters (handles punctuation and whitespace)
        String[] words = input.split("\\W+");

        // Count the occurrences of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        // Display the word counts in alphabetical order
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
