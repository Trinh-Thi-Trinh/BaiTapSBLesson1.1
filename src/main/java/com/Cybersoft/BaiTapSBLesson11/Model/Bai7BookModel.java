package com.Cybersoft.BaiTapSBLesson11.Model;

public class Bai7BookModel {

    private int id;
    private String title;
    private String author;

    public Bai7BookModel() {
    }

    public Bai7BookModel(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}