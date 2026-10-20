package com.Cybersoft.BaiTapSBLesson11.Entity;

import java.util.ArrayList;
import java.util.List;

public class Bai10Order {

    private int id;
    private String customerName;
    private List<Bai10Product> products = new ArrayList<>();

    public Bai10Order() {
    }

    public Bai10Order(
            int id,
            String customerName,
            List<Bai10Product> products) {
        this.id = id;
        this.customerName = customerName;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Bai10Product> getProducts() {
        return products;
    }

    public void setProducts(List<Bai10Product> products) {
        this.products = products;
    }
}