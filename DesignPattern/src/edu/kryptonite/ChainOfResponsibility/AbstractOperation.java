package edu.kryptonite.ChainOfResponsibility;

import edu.kryptonite.OperationType;

public interface AbstractOperation {
    void setNextOperation(AbstractOperation nextOperation);
    void doOperation(double x, double y, OperationType type);
}

