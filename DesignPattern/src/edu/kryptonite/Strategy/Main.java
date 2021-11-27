package edu.kryptonite.Strategy;

public class Main {

    public static void main(String[] args) {
        Context ctx = new Context(new PowerOfStrategy());
        System.out.println("3^11 = "+ctx.executeOperation(4,5));

        ctx = new Context(new LogOfStrategy());
        System.out.println("log[3](12) = "+ctx.executeOperation(3,12));
        ctx = new Context(new ProductOfStrategy());
        System.out.println("3.0*4.0 = "+ctx.executeOperation(3,4));
    }
}
