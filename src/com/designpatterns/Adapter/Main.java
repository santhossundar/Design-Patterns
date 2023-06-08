package com.designpatterns.Adapter;

public class Main {
    public static void main(String[] args){
        Viewer jpgViewer = new JPGViewer();
        jpgViewer.view();

        Viewer pngViewer = new PNGViewer();
        pngViewer.view();

        Viewer heicViewer = new ViewerAdapter(new HEICViewer());
        heicViewer.view();
    }
}
