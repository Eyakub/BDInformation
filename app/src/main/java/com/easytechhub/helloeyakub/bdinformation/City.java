package com.easytechhub.helloeyakub.bdinformation;

/**
 * Created by Eyakub on 10/31/2017.
 */

public class City {
    private String details;
    private int images;

    public City(String details, int images) {
        this.details = details;
        this.images = images;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
