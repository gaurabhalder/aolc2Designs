package edu.kryptonite.ChainOfResponsibility;

import edu.kryptonite.OperationType;

public class LogOfOperation implements AbstractOperation{
    private AbstractOperation nextOperation;
    @Override
    public void setNextOperation(AbstractOperation nextOperation) {
        this.nextOperation  = nextOperation;
    }

    @Override
    public void doOperation(double x, double y, OperationType type) {
        if(type == OperationType.LogOf){
            double b=0.000001, c=0.0;
            while (c!=x)
            {
                c=Math.pow(x,b);

                b=b+0.000001;
                if (c>y)
                    break;
            }
            System.out.println("log["+x+"]("+y+") = "+b);
        }
        else {
            nextOperation.doOperation(x,y, type);
        }
    }
}
