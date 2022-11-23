package com.example.amazonprimevideoclone.models;

public class BannerMovie {

    private int id;
    private String name;
    private String imageUrl;
    private String fileUrl;


    public BannerMovie(int id, String name, String imageUrl, String fileUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.fileUrl = fileUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
