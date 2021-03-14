package com.nastya;

public class Competition {
    protected int sweemDistance;
    protected int runDistance;

    public Competition ( int sweemDistance , int runDistance ) {
        this.sweemDistance = sweemDistance;
        this.runDistance = runDistance;
    }

    public int getSweemDistance () {
        return sweemDistance;
    }

    public void setSweemDistance ( int sweemDistance ) {
        this.sweemDistance = sweemDistance;
    }

    public int getRunDistance () {
        return runDistance;
    }

    public void setRunDistance ( int runDistance ) {
        this.runDistance = runDistance;
    }
}
