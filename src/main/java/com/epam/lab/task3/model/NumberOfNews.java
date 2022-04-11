package com.epam.lab.task3.model;

public class NumberOfNews extends Chars{
    private Integer numberOfNews;

    public NumberOfNews() {
        super("number of news per page");
    }
    @Override
    public void setValue(String value) {
        numberOfNews = Integer.parseInt(value);
    }

    @Override
    public String getValue() {
        return String.valueOf(numberOfNews);
    }
}
