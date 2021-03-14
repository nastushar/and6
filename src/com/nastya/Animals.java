package com.nastya;

public abstract class Animals {
    protected String name;
protected static int animalCount=0;
    public Animals ( String name ) {
        this.name = name;
        animalCount++;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }
}
