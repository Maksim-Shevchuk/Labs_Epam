package com.epam.lab.task2.utils;

import com.epam.lab.task2.Word;
import java.util.Comparator;

public class NumberOfOccurrencesComparator implements Comparator<Word> {

  private char symbol;

  public NumberOfOccurrencesComparator(char symbol1) {
    this.symbol = symbol1;
  }

  @Override
  public int compare(Word word1, Word word2) {
    long firstWordLettersCount = word1.getWord().toLowerCase().chars().filter(ch -> ch == symbol).count();
    long secondWordLettersCount = word2.getWord().toLowerCase().chars().filter(ch -> ch == symbol).count();
    return (int)(firstWordLettersCount - secondWordLettersCount);
  }
}
