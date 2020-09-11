package com.wodder.jeep.parts;

import com.wodder.jeep.parts.bumpers.Bumper;
import com.wodder.jeep.parts.bumpers.MidrangeFrontBumper;
import com.wodder.jeep.parts.bumpers.MidrangeRearBumper;
import com.wodder.jeep.parts.radios.CbRadio;
import com.wodder.jeep.parts.radios.StockCbRadio;
import com.wodder.jeep.parts.suspension.PremiumSuspension;
import com.wodder.jeep.parts.suspension.Suspension;
import com.wodder.jeep.parts.tires.StockTires;
import com.wodder.jeep.parts.tires.Tires;

public class MidrangeJeepParts implements JeepPartsFactory {
    @Override
    public Tires createTires() {
        return new StockTires();
    }

    @Override
    public Suspension createSuspension() {
        return new PremiumSuspension();
    }

    @Override
    public Bumper createFrontBumper() {
        return new MidrangeFrontBumper();
    }

    @Override
    public Bumper createRearBumper() {
        return new MidrangeRearBumper();
    }

    @Override
    public CbRadio createCbRadio() {
        return new StockCbRadio();
    }
}
