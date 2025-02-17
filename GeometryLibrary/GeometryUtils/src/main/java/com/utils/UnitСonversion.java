package com.utils;

public class UnitСonversion {
    private double unit;

    public UnitСonversion(double unit) {
        this.unit = unit;
    }

    public UnitСonversion() {

    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    public double convert(double unitCantimetr) {
        return unitCantimetr *= 10;
    }
}
