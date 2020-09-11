package com.wodder.jeep.parts.suspension;

public class StockSuspension implements Suspension {
    private final String description;

    public StockSuspension() {
        this.description = "Stock Suspension";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
