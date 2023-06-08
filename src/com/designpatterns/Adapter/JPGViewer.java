package com.designpatterns.Adapter;

public class JPGViewer implements Viewer {
    @Override
    public void view() {
        System.out.println("Viewing JPG file...");
    }
}
