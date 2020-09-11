package com.wodder.jeep.parts;

import com.wodder.jeep.parts.bumpers.Bumper;
import com.wodder.jeep.parts.radios.CbRadio;
import com.wodder.jeep.parts.suspension.Suspension;
import com.wodder.jeep.parts.tires.Tires;

public interface JeepPartsFactory {

    Tires createTires();
    Suspension createSuspension();
    Bumper createFrontBumper();
    Bumper createRearBumper();
    CbRadio createCbRadio();
}
