package com.wodder.jeep;

import java.util.Arrays;

public enum JeepTypes {
    PREMIUM("Premium"),
    MID_RANGE("Mid-range"),
    STOCK("Stock");

    private final String type;

    JeepTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public boolean equals(String otherType) {
        return this.type.equalsIgnoreCase(otherType);
    }

    public static boolean isValidType(String type) {
        return Arrays.stream(JeepTypes.values()).anyMatch((j) -> j.equals(type));
    }
}
