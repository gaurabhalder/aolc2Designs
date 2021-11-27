package edu.kryptonite.ChainOfResponsibility;

import edu.kryptonite.OperationType;

public class ProductOfOperation implements AbstractOperation{
    private AbstractOperation nextOperation;
    @Override
    public void setNextOperation(AbstractOperation nextOperation) {
        this.nextOperation  = nextOperation;
    }

    @Override
    public void doOperation(double x, double y, OperationType type) {
        if(type == OperationType.ProductOf){
            System.out.println(x+"*"+y+" = "+ x*y);
        }
        else {
            nextOperation.doOperation(x,y, type);
        }
    }
}
