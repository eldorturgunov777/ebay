package com.example.ebay.model;

/**
 * Created by Eldor Turgunov on 22.05.2022.
 * ebay
 * eldorturgunov777@gmail.com
 */
public class ListData {
    int img;
    String title;
    String price;
    String discount;
    String percent;

    public ListData(int img, String title, String price, String discount, String percent) {
        this.img = img;
        this.title = title;
        this.price = price;
        this.discount = discount;
        this.percent = percent;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
}
