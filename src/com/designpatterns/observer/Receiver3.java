package com.designpatterns.observer;

public class Receiver3 implements Receiver{
    @Override
    public void sendMsg(String msg) {
        System.out.println("The Msg was sent to Receiver3!");
    }
}
