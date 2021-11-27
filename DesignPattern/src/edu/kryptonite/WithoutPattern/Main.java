package edu.kryptonite.WithoutPattern;

import edu.kryptonite.OperationType;

public class Main {
    public static void main(String[] args) {
        OperationType type = OperationType.ProductOf;
        calculate(3, 4, type);
        type = OperationType.PowerOf;
        calculate(4,5,type);
        type = OperationType.LogOf;
        calculate(3, 12,type);
    }

    private static void calculate(double x, double y, OperationType type) {
        if(type == OperationType.PowerOf){
            System.out.println(x+"^"+y+" = "+power(x,y));
        }
        else if(type == OperationType.ProductOf){
            System.out.println(x+"*"+y+" = "+product(x,y));
        }
        else if(type == OperationType.LogOf){
            System.out.println("log["+x+"]("+y+") = "+logOf(x,y));
        }
    }
    static double logOf(double x, double y) {

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
    static double product(double x, double y){
        return x*y;
    }
    static double power(double x, double y){
        return Math.pow(x,y);
    }
}
