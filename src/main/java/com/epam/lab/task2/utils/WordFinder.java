package com.epam.lab.task2.utils;
import com.epam.lab.task2.Word;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordFinder {

  public WordFinder() {
  }

  private List<Word> findWordsByRegExp(String text, String regExp) {
    List<Word> words = new ArrayList<>();
    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      words.add(new Word(matcher.group()));
    }
    return words;
  }

  public List<Word> sortByOccurrencesAndAlphabet(List<Word> words, char symbol) {
    Comparator<Word> comparatorByLettersCount = new NumberOfOccurrencesComparator(
        symbol).reversed();
    Comparator<Word> compareByAlphabet = Comparator.comparing(Word::getWord,
        String.CASE_INSENSITIVE_ORDER);
    return words.stream()
        .sorted(comparatorByLettersCount
            .thenComparing(compareByAlphabet))
        .collect(Collectors.toList());

  }

  public List<Word> findEmail(String text){
    return findWordsByRegExp(text, "([a-zA-Z0-9_\\.-]+)@([a-z0-9_\\*]+)\\.([a-z\\{3,}]{2,6})");
  }

  public List<Word> findPhoneNumber(String text){
    return findWordsByRegExp(text, "\\+\\d{3}\\(\\d{2}\\)\\d{3}\\-\\d{2}\\-\\d{2}");
  }

  // emil is not a word
  public List<Word> findWords(String text){
    return findWordsByRegExp(text, "(?<!@|@\\w{1,7}\\.)\\b[a-zA-z']+\\b(?!@)");
  }
}

