package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Sender {
    List<Receiver> receivers = new ArrayList<Receiver>();

    public void subscribe(Receiver receiver){
        receivers.add(receiver);
    }

    public void unsubscribe(Receiver receiver){
        receivers.remove(receiver);
    }

    public void sendMsg(String msg){
        for(Receiver receiver: receivers){
            receiver.sendMsg(msg);
        }
    }
}
