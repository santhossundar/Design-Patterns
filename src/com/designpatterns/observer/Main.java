package com.designpatterns.observer;

public class Main {
    public static void main(String[] args){
        Sender sender = new Sender();

        sender.subscribe(new Receiver1());
        sender.subscribe(new Receiver2());
        sender.subscribe(new Receiver3());

        sender.sendMsg("Your are selected for our job interview!");
    }
}
