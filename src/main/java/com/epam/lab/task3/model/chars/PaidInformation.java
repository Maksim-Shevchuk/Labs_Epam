package com.epam.lab.task3.model.chars;

public class PaidInformation extends Chars {

    private Boolean isInformationPaid;

    public PaidInformation() {
        super("is information paid");
    }

    @Override
    public void setValue(String value) {
        isInformationPaid = Boolean.parseBoolean(value);
    }

    @Override
    public String getValue() {
        return String.valueOf(isInformationPaid);
    }
}

