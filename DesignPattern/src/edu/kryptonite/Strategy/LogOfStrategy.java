package edu.kryptonite.Strategy;

public class LogOfStrategy implements Strategy {

    @Override
    public double doOperation(double x, double y) {

        double b=0.000001, c=0.0;
        while (c!=x)
        {
            c=Math.pow(x,b);

            b=b+0.000001;
            if (c>y)
                break;
        }
        return b;
    }
}
