package edu.kryptonite.Strategy;

public class ProductOfStrategy implements Strategy {

    @Override
    public double doOperation(double x, double y) {

        return x * y;
    }
}
