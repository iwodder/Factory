package com.wodder.jeep.parts.tires;

public class StockTires implements Tires {
    private String description;

    public StockTires() {
        this.description = "Stock 33\" Tires";
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
