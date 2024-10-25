package org.cansezer.logistic;


public class Ship implements Transport {
    @Override
    public String deliver() {
        return "Delivery by sea by ship.";
    }
}