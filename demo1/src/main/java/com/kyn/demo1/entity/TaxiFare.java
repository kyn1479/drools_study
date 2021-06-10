package com.kyn.demo1.entity;


import java.math.BigDecimal;

public class TaxiFare {
    private BigDecimal  nightSurcharge=BigDecimal.ZERO;
    private BigDecimal  rideFare=BigDecimal.ZERO;
    public BigDecimal  total() {
        return this.nightSurcharge.add(this.rideFare);
    }

    public BigDecimal getNightSurcharge() {
        return nightSurcharge;
    }

    public void setNightSurcharge(BigDecimal nightSurcharge) {
        this.nightSurcharge = nightSurcharge;
    }

    public BigDecimal getRideFare() {
        return rideFare;
    }

    public void setRideFare(BigDecimal rideFare) {
        this.rideFare = rideFare;
    }

    @Override
    public String toString() {
        return "TaxiFare{" +
                "nightSurcharge=" + nightSurcharge +
                ", rideFare=" + rideFare +
                '}';
    }
}
