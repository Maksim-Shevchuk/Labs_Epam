package com.epam.lab.task3.model;

public enum WebPageType {
    ADVERTISING_WEB_PAGE("advertising"),
    NEWS_WEB_PAGE("news"),
    MIRROR_WEB_PAGE("mirror"),
    PORTAL_WEB_PAGE("portal");

    private final String webPageType;

    WebPageType(String webPageType) {
        this.webPageType = webPageType;
    }

    public String getWebPageType() {
        return webPageType;
    }
}
