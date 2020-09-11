package com.wodder.jeep;

public abstract class JeepStore {

    protected abstract Jeep orderJeep(JeepTypes type);

    public Jeep buildJeep(JeepTypes type) {

        Jeep jeep = orderJeep(type);

        jeep.attachSuspension();
        jeep.attachFrontBumper();
        jeep.attachRearBumper();
        jeep.installRadio();
        jeep.attachTires();

        return jeep;
    }

}
