package com.wodder.jeep;

import com.wodder.jeep.parts.JeepPartsFactory;

public class Jeep extends AbstractJeep {
    private final JeepTypes type;

    public Jeep(JeepPartsFactory partsFactory, JeepTypes type) {
        super(partsFactory);
        this.type = type;
    }

    @Override
    public String description() {
        return type.getType() + " " + super.description();
    }
}
