package com.company;

public class Exchanger {


    private Double usdCost;


    public Exchanger(Double usdCost) {
        this.usdCost = usdCost;
    }

    public Double exhageFromUsd(Double amount) {

        return amount / this.usdCost;
    }

    public Double exhageFromUah(Double amount) {

        return amount * this.usdCost;
    }

    public Double getUsdCost() {
        return usdCost;
    }
}
