// Incompatible Interface for Adapter
// Uses Chain of Responsibility Pattern

package com.carrental.CarRentalApp.Pricing;
public interface PriceSetter {
    void setFactor(int factor);
    int getFactor();
    void setNext(PriceSetter next);
    PriceSetter handle(int state);
}
class AudiCal implements PriceSetter {
    private int factor = 1000;
    private PriceSetter next;


    @Override
    public void setFactor(int f) {factor=f;}
    @Override
    public int getFactor() {return factor;}
    @Override
    public void setNext(PriceSetter next) {this.next = next;}
    @Override
    public PriceSetter handle(int state) {
        if (state == 1) {
            return this;
        } else if (next != null) {
            return next.handle(state);
        } else {
            throw new IllegalArgumentException("No handler for state: " + state);
        }
    }
}
class BMWCal implements PriceSetter {
    private int factor = 1300;
    private PriceSetter next;

    @Override
    public void setFactor(int f) {factor=f;}
    @Override
    public int getFactor() {return factor;}
    @Override
    public void setNext(PriceSetter next) {this.next = next;}
    @Override
    public PriceSetter handle(int state) {
        if (state == 2) {
            return this;
        } else if (next != null) {
            return next.handle(state);
        } else {
            throw new IllegalArgumentException("No handler for state: " + state);
        }
    }
}
class MercedesCal implements PriceSetter {
    private int factor = 1250;
    private PriceSetter next;

    @Override
    public void setFactor(int f) {factor=f;}
    @Override
    public int getFactor() {return factor;}
    @Override
    public void setNext(PriceSetter next) {this.next = next;}
    @Override
    public PriceSetter handle(int state) {
        if (state == 3) {
            return this;
        } else if (next != null) {
            return next.handle(state);
        } else {
            throw new IllegalArgumentException("No handler for state: " + state);
        }
    }
}