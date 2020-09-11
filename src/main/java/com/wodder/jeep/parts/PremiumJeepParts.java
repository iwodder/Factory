package com.wodder.jeep.parts;

import com.wodder.jeep.parts.bumpers.Bumper;
import com.wodder.jeep.parts.bumpers.PremiumFrontBumper;
import com.wodder.jeep.parts.bumpers.PremiumRearBumper;
import com.wodder.jeep.parts.radios.CbRadio;
import com.wodder.jeep.parts.radios.PremiumCbRadio;
import com.wodder.jeep.parts.suspension.PremiumSuspension;
import com.wodder.jeep.parts.suspension.Suspension;
import com.wodder.jeep.parts.tires.PremiumTires;
import com.wodder.jeep.parts.tires.Tires;

public class PremiumJeepParts implements JeepPartsFactory {
    @Override
    public Tires createTires() {
        return new PremiumTires();
    }

    @Override
    public Suspension createSuspension() {
        return new PremiumSuspension();
    }

    @Override
    public Bumper createFrontBumper() {
        return new PremiumFrontBumper();
    }

    @Override
    public Bumper createRearBumper() {
        return new PremiumRearBumper();
    }

    @Override
    public CbRadio createCbRadio() {
        return new PremiumCbRadio();
    }
}
