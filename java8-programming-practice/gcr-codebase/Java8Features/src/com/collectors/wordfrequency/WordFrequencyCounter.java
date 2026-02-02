package com.collectors.wordfrequency;
import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String paragraph = "Java streams make Java code more readable and streams make data processing easier";

        Map<String, Long> wordCount = Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                                      .collect(Collectors.toMap(word -> word,  word -> 1L, Long::sum )); 
                    

        wordCount.forEach((word, count) ->
            System.out.println(word + " : " + count)
        );
    }
}
