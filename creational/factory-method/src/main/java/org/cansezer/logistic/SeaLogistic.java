package org.cansezer.logistic;


public class SeaLogistic extends Logistic {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}