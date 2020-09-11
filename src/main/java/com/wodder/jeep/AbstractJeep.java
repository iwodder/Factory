package com.wodder.jeep;

import com.wodder.jeep.parts.JeepPartsFactory;

public class AbstractJeep {
    protected JeepPartsFactory partsFactory;

    public AbstractJeep(JeepPartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    public void attachSuspension() {
        System.out.println("Attaching suspension...");
    }

    public void attachRearBumper() {
        System.out.println("Attaching rear bumper...");
    }

    public void attachFrontBumper() {
        System.out.println("Attaching front bumper...");
    }

    public void installRadio() {
        System.out.println("Installing cb radio...");
    }

    public void attachTires() {
        System.out.println("Attaching tires...");
    }

    public void rollOutOfShop() {
        System.out.println("Rolling off the line...");
    }

    public String description() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(partsFactory.createSuspension().getDescription().toLowerCase());
        stringBuilder.append(", ");
        stringBuilder.append(partsFactory.createRearBumper().getDescription().toLowerCase());
        stringBuilder.append(", ");
        stringBuilder.append(partsFactory.createFrontBumper().getDescription().toLowerCase());
        stringBuilder.append(", ");
        stringBuilder.append(partsFactory.createCbRadio().getDescription().toLowerCase());
        stringBuilder.append(", and a set of ");
        stringBuilder.append(partsFactory.createTires().getDescription().toLowerCase());
        return "Jeep was built specially for you with a " + stringBuilder.toString() + "!";
    }
}
