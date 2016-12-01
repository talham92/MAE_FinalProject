package com.mobileappclass.myapplication;

/**
 * Created by talhamahmood on 11/30/16.
 */

public class Book {

    private final int name;
    private final int author;
    private final int imageResource;
    private boolean isFavorite = false;

    public Book(int name, int author, int imageResource) {
        this.name = name;
        this.author = author;
        this.imageResource = imageResource;
    }

    public int getName() {
        return name;
    }

    public int getAuthor() {
        return author;
    }

    public int getImageResource() {
        return imageResource;
    }

    public boolean getIsFavorite() {
        return isFavorite;
    }
    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public void toggleFavorite() {
        isFavorite = !isFavorite;
    }




}
