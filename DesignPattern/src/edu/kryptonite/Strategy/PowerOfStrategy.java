package edu.kryptonite.Strategy;

public class PowerOfStrategy implements Strategy {

    @Override
    public double doOperation(double x, double y) {
        return Math.pow(x,y);
    }
}
