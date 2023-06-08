package com.designpatterns.Factory;

public class OperationFactory {
    private static Operation operation;

    public static Operation getOperation(String opt){
        if(opt == "+"){
            operation = new Addition();
        } else if(opt == "-"){
            operation = new Subtraction();
        }

        return operation;
    }
}
