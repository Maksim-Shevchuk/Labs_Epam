package com.epam.lab.task3.comparators;

import com.epam.lab.task3.model.WebPage;
import java.util.Comparator;

public class WebPageTitleComparator implements Comparator<WebPage> {

    @Override
    public int compare(WebPage o1, WebPage o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
