package com.epam.lab.task3.model;

public class ArchiveAvailable extends Chars {

    private Boolean isArchiveAvailable;

    public ArchiveAvailable() {
        super("is archive avilable for downloading");
    }

    @Override
    public void setValue(String value) {
        isArchiveAvailable = Boolean.parseBoolean(value);
    }

    @Override
    public String getValue() {
        return String.valueOf(isArchiveAvailable);
    }
}
