package com.wodder.jeep.parts.tires;

import com.wodder.jeep.parts.tires.Tires;

public class PremiumTires implements Tires {

    private final String description;

    public PremiumTires() {
        this.description = "Premium 35\" Tires";
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
