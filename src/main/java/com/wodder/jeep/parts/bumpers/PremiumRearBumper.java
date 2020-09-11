package com.wodder.jeep.parts.bumpers;

public class PremiumRearBumper implements Bumper {
    private final String description;

    public PremiumRearBumper() {
        this.description = "Premium rear bumper";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
