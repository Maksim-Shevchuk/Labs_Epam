package com.epam.lab.task3.model;

public class VotingAvailable extends Chars {

    private Boolean isVotingAvailable;

    public VotingAvailable() {
        super("is voting available");
    }

    @Override
    public void setValue(String value) {
        isVotingAvailable = Boolean.parseBoolean(value);
    }

    @Override
    public String getValue() {
        return String.valueOf(isVotingAvailable);
    }
}
