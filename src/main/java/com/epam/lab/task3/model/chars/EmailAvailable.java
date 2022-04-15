package com.epam.lab.task3.model.chars;

public class EmailAvailable extends Chars{

    private Boolean isEmailAvailable;

    public EmailAvailable() {
        super("is email available");
    }

    @Override
    public void setValue(String value) {
        isEmailAvailable = Boolean.parseBoolean(value);
    }

    @Override
    public String getValue() {
        return String.valueOf(isEmailAvailable);
    }
}


