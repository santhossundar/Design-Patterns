package com.designpatterns.Adapter;

public class PNGViewer implements Viewer {
    @Override
    public void view() {
        System.out.println("Viewing PNG file...");
    }
}
