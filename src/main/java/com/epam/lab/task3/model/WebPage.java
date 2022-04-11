package com.epam.lab.task3.model;

import java.util.List;

public class WebPage {

    private String identity;
    private String title;
    private WebPageType webPageType;
    private Boolean needAuthorization;
    private List<Chars> chars;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WebPageType getWebPageType() {
        return webPageType;
    }

    public void setWebPageType(WebPageType webPageType) {
        this.webPageType = webPageType;
    }

    public void setChars(List<Chars> chars) {
        this.chars = chars;
    }

    public List<Chars> getChars() {
        return chars;
    }

    public Boolean getNeedAuthorization() {
        return needAuthorization;
    }

    public void setNeedAuthorization(Boolean needAuthorization) {
        this.needAuthorization = needAuthorization;
    }

    @Override
    public String toString() {
        return "WebPage{" +
            "identity='" + identity + '\'' +
            ", title='" + title + '\'' +
            ", webPageType=" + webPageType +
            ", chars=" + chars +
            ", needAuthorization=" + needAuthorization +
            '}';
    }
}
