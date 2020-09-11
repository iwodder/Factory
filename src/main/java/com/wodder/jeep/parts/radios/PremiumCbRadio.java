package com.wodder.jeep.parts.radios;


public class PremiumCbRadio implements CbRadio {
    private final String description;

    public PremiumCbRadio() {
        this.description = "Premium Cb-radio";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
