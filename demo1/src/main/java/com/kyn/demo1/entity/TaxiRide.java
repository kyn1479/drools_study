package com.kyn.demo1.entity;

import java.math.BigDecimal;

public class TaxiRide {
    private Boolean isNightSurcharge;
    private BigDecimal distanceInMile;

    public TaxiRide(Boolean isNightSurcharge, BigDecimal distanceInMile) {
        this.isNightSurcharge = isNightSurcharge;
        this.distanceInMile = distanceInMile;
    }

    public Boolean getIsNightSurcharge() {
        return isNightSurcharge;
    }

    public void setIsNightSurcharge(Boolean nightSurcharge) {
        isNightSurcharge = nightSurcharge;
    }

    public BigDecimal getDistanceInMile() {
        return distanceInMile;
    }

    public void setDistanceInMile(BigDecimal distanceInMile) {
        this.distanceInMile = distanceInMile;
    }
    @Override
    public String toString() {
        return "TaxiRide{" +
                "isNightSurcharge=" + isNightSurcharge +
                ", distanceInMile=" + distanceInMile +
                '}';
    }
}
