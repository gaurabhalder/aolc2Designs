package edu.kryptonite.ChainOfResponsibility;

import edu.kryptonite.OperationType;

public class Main {

    public static void main(String[] args) {
        AbstractOperation levelOfStudies = getChainOfLevels();
        levelOfStudies.doOperation(3, 4, OperationType.ProductOf);
        levelOfStudies.doOperation(4, 5, OperationType.PowerOf);
        levelOfStudies.doOperation(5, 12, OperationType.LogOf);
    }

    public static AbstractOperation getChainOfLevels(){
        AbstractOperation productOf = new ProductOfOperation();
        AbstractOperation powerOff = new PowerOfOperation();
        AbstractOperation logOff = new LogOfOperation();

        productOf.setNextOperation(powerOff);
        powerOff.setNextOperation(logOff);

        return productOf;
    }
}

