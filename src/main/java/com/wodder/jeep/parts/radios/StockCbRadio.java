package com.wodder.jeep.parts.radios;

public class StockCbRadio implements CbRadio {
    private final String description;

    public StockCbRadio() {
        this.description = "Stock Cb-radio";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
