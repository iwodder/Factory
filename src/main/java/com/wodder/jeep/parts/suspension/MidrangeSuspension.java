package com.wodder.jeep.parts.suspension;

public class MidrangeSuspension implements Suspension {
    private final String description;

    public MidrangeSuspension() {
        this.description = "Midrange Suspension";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
