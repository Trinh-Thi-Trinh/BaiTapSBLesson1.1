
package com.Cybersoft.BaiTapSBLesson11.Model;

public class Bai4ProductModel {

    private int id;
    private String name;
    private double price;

    public Bai4ProductModel() {
    }

    public Bai4ProductModel(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
