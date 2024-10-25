package org.cansezer.logistic;

public abstract class Logistic {
    protected abstract Transport createTransport();

    public String planDelivery() {
        Transport transport = createTransport();
        return transport.deliver();
    }
}