package com.epam.lab.task3.model;

public enum WebPageType {

    ADVERTISING_WEB_PAGE("ADVERTISING"),
    NEWS_WEB_PAGE("NEWS"),
    MIRROR_WEB_PAGE("MIRROR"),
    PORTAL_WEB_PAGE("PORTAL");

    private final String webPageType;

    WebPageType(String webPageType) {
        this.webPageType = webPageType;
    }

    public String getWebPageType() {
        return webPageType;
    }
}
