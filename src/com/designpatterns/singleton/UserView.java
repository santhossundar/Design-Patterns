package com.designpatterns.singleton;

public class UserView {
    private static UserView instance;
    private String versionInfo;

    private UserView(){}

    public static UserView getInstance(){
        if(instance == null){
            instance = new UserView();
        }

        return instance;
    }

    public void setVersionInfo(String version){
        versionInfo = version;
    }

    public String showVersionInfo(){
        return versionInfo;
    }
}
