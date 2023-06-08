package com.designpatterns.Adapter;

public class ViewerAdapter implements Viewer {
    private HEICViewer imageViewer;

    public ViewerAdapter(HEICViewer imageViewer){
        this.imageViewer = imageViewer;
    }

    @Override
    public void view() {
        imageViewer.show();
    }
}
