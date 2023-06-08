package com.designpatterns.singleton;

public class Main {
    public static void main(String[] args){
        UserView userView1 = UserView.getInstance();
        UserView userView2 = UserView.getInstance();
        UserView userView3 = UserView.getInstance();

        userView1.setVersionInfo("v7");
        userView2.setVersionInfo("v8");
        userView3.setVersionInfo("v9");

        System.out.println(userView1.showVersionInfo());
        System.out.println(userView2.showVersionInfo());
        System.out.println(userView3.showVersionInfo());
    }
}
