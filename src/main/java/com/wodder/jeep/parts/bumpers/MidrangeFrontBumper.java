package com.wodder.jeep.parts.bumpers;

public class MidrangeFrontBumper implements Bumper {
    private final String description;

    public MidrangeFrontBumper() {
        this.description = "Midrange front bumper";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
