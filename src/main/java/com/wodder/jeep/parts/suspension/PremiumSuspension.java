package com.wodder.jeep.parts.suspension;

public class PremiumSuspension implements Suspension {
    private final String description;

    public PremiumSuspension() {
        this.description = "Premium Suspension";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
