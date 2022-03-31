package com.epam.lab.task2;

public class Word {

  private String text;

  public Word(String text) {
    this.text = text;
  }

  public String getWord() {
    return text;
  }

  @Override
  public String toString() {
    return text;
  }
}
