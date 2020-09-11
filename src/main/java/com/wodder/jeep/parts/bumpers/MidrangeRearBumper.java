package com.wodder.jeep.parts.bumpers;

public class MidrangeRearBumper implements Bumper {
    private final String description;

    public MidrangeRearBumper() {
        this.description = "Midrange rear bumper";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
