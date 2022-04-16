package com.epam.lab.task2;

import com.epam.lab.task2.utils.WordFinder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("src\\main\\java\\com\\epam\\lab\\task2\\book.txt");
        String text = "";
        try {
            text = Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        WordFinder wordFinder = new WordFinder();
        List<Word> words = wordFinder.findWords(text);
        System.out.println(wordFinder.sortByOccurrencesAndAlphabet(words, 'a'));
        System.out.println(wordFinder.findEmail(text));
        System.out.println(wordFinder.findPhoneNumber(text));
    }
}
