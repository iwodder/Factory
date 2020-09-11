package com.wodder.jeep.parts.bumpers;

public class StockFrontBumper implements Bumper {
    private final String description;

    public StockFrontBumper() {
        this.description = "Stock front bumper";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
