package com.wodder.jeep.parts;

import com.wodder.jeep.parts.bumpers.Bumper;
import com.wodder.jeep.parts.bumpers.StockFrontBumper;
import com.wodder.jeep.parts.bumpers.StockRearBumper;
import com.wodder.jeep.parts.radios.CbRadio;
import com.wodder.jeep.parts.radios.StockCbRadio;
import com.wodder.jeep.parts.suspension.StockSuspension;
import com.wodder.jeep.parts.suspension.Suspension;
import com.wodder.jeep.parts.tires.StockTires;
import com.wodder.jeep.parts.tires.Tires;

public class StockJeepParts implements JeepPartsFactory {
    @Override
    public Tires createTires() {
        return new StockTires();
    }

    @Override
    public Suspension createSuspension() {
        return new StockSuspension();
    }

    @Override
    public Bumper createFrontBumper() {
        return new StockFrontBumper();
    }

    @Override
    public Bumper createRearBumper() {
        return new StockRearBumper();
    }

    @Override
    public CbRadio createCbRadio() {
        return new StockCbRadio();
    }
}
