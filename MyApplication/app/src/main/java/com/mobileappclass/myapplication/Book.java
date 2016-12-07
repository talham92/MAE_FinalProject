package com.mobileappclass.myapplication;

/**
 * Created by talhamahmood on 11/30/16.
 */

public class Book {

    private  int name;
    private  int author;
    private  int imageResource;
    private boolean isFavorite = false;



    public Book(int name, int author, int imageResource) {
        this.name = name;
        this.author = author;
        this.imageResource = imageResource;
    }

    public Book(int name, int imageResource){
        this.name = name;
        this.imageResource = imageResource;
    }

    public Book(){

    }

    public void setName(int name) {

        this.name = name;
    }

    public void setAuthor(int author) {

        this.author = author;
    }

    public void setImageResource(int imageResource) {

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






}
