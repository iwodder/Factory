package com.wodder.jeep.parts.bumpers;

public class StockRearBumper implements Bumper {
    private final String description;

    public StockRearBumper() {
        this.description = "Stock rear bumper";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
