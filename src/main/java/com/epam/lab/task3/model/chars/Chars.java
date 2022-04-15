package com.epam.lab.task3.model.chars;

public abstract class Chars {

    private String name;
    private String element;

    public Chars(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public abstract void setValue(String value);

    public abstract String getValue();

    @Override
    public String toString() {
        return getValue();
    }
}
