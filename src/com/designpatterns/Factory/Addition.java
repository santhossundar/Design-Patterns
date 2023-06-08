package com.designpatterns.Factory;

public class Addition implements Operation{
    @Override
    public void perform() {
        System.out.println("Performing Addition...");
    }
}
