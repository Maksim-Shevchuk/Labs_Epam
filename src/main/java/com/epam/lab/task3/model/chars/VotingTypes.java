package com.epam.lab.task3.model.chars;

public enum VotingTypes {
    ANONYMOUS("anonymous"),
    OPEN_VOTE("open"),
    UNAPPROACHABLE("unapproachable");
    private String type;

    VotingTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

