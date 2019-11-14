package com.example.shubham1.recyclershubhamm.gridrecyclerview.model;

public class Model {

    private String name;
    private int images;

    public Model(String name, int images) {
        this.name = name;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
