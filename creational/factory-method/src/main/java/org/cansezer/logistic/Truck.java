package org.cansezer.logistic;


public class Truck implements Transport {
    @Override
    public String deliver() {
        return "Delivery via highway by truck.";
    }
}