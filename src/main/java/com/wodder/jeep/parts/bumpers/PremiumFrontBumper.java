package com.wodder.jeep.parts.bumpers;

public class PremiumFrontBumper implements Bumper {
    private final String description;

    public PremiumFrontBumper() {
        this.description = "Premium front bumper";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
