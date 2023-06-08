package com.designpatterns.Factory;

public class Main {
    public static void main(String[] args){
        Operation operation = OperationFactory.getOperation("-");
        operation.perform();
    }
}
