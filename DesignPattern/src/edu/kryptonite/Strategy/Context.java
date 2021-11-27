package edu.kryptonite.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeOperation(double x, double y) {
        return strategy.doOperation(x, y);
    }
}
