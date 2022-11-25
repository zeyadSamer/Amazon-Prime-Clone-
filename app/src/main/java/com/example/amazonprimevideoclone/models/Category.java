package com.example.amazonprimevideoclone.models;

import java.util.List;

public class Category {

    private String title;
    private int id;
    private List<CategoryMovie> categoryMovieList;


    public Category(String title, int id, List<CategoryMovie> categoryMovieList) {
        this.title = title;
        this.id = id;
        this.categoryMovieList = categoryMovieList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CategoryMovie> getCategoryMovieList() {
        return categoryMovieList;
    }

    public void setCategoryMovieList(List<CategoryMovie> categoryMovieList) {
        this.categoryMovieList = categoryMovieList;
    }
}
