package com.mvp.model;

/**
 * Created by ardenolgundemir on 12/05/2017.
 */

public class PictureModel {


    private int image;
    private String name;

    public PictureModel(String name, int image) {
        this.name = name;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

}
