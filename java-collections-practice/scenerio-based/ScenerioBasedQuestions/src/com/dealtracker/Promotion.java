package com.dealtracker;

public abstract class Promotion {

    protected String code;

    public Promotion(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
