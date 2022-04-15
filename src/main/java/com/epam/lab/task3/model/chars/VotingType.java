package com.epam.lab.task3.model.chars;

public class VotingType extends Chars {

    private VotingTypes votingTypes;

    public VotingType() {
        super("type of voting");
    }

    @Override
    public void setValue(String value) {
        votingTypes = VotingTypes.valueOf(value);
    }

    @Override
    public String getValue() {
        return votingTypes.toString();
    }
}