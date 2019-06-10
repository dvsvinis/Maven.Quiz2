package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    public Horse() {

    }

    @Override
    public String move() {
        return "gallup";
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String color() {
        return null;
    }
}
