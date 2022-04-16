package com.epam.lab.task3.comparators;

import com.epam.lab.task3.model.WebPage;

import java.util.Comparator;

public class WebPageTitleComparator implements Comparator<WebPage> {

    @Override
    public int compare(WebPage webPage1, WebPage webPage2) {
        return webPage1.getTitle().compareTo(webPage2.getTitle());
    }
}
