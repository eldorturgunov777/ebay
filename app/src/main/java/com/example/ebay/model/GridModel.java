package com.example.ebay.model;

/**
 * Created by Eldor Turgunov on 22.05.2022.
 * ebay
 * eldorturgunov777@gmail.com
 */
public class GridModel {
    int img;
    String title;

    public GridModel(int img, String title) {
        this.img = img;
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
